package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * 	Singleton Design Pattern 적용 
 *  1. private 생성자 
 *  2. private static 변수에 자신의 객체를 생성 
 *  3. public static method(getInstance())로 공유 
 */
public class ProductDAO {
	private static ProductDAO instance=new ProductDAO();
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String userpass="tiger";
	private ProductDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	public static ProductDAO getInstance() {
		return instance;
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) 
			throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public int getTotalProductCount() throws SQLException {
		int count=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select count(*) from web_product";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next())
				count=rs.getInt(1);
		}finally {
			closeAll(rs, pstmt, con);
		}
		return count;
	}
	public ProductVO findProductById(String id) throws SQLException {
		ProductVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select name,maker,price from web_product where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo=new ProductVO(id,rs.getString(1),rs.getString(2),rs.getInt(3));
			}				
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	public ArrayList<ProductVO> getAllProductList() throws SQLException{
		ArrayList<ProductVO> list=new ArrayList<ProductVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select id,name from web_product order by id desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ProductVO vo=new ProductVO();
				vo.setId(rs.getString(1));
				vo.setName(rs.getString(2));
				list.add(vo);				
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	//maker 종류를 조회해서 리스트로 반환
	public ArrayList<String> getMakerList() throws SQLException{
		ArrayList<String> list = new ArrayList<String>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
			con = DriverManager.getConnection(url,username,userpass);
			String sql="SELECT DISTINCT(MAKER) FROM WEB_PRODUCT";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("MAKER"));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	
	public ArrayList<ProductVO> findMakerProductById(String maker) throws SQLException {
		ArrayList<ProductVO> list= new ArrayList<ProductVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select id,name,maker,price from web_product where maker=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, maker);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new ProductVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}				
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	public void registerProduct(ProductVO vo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url,username,userpass);
			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO WEB_PRODUCT VALUES(web_product_seq.NEXTVAL,?,?,?)");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setInt(3, vo.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(null, pstmt, con);
		}
	}
}




















