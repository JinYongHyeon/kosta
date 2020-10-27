package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	private static ProductDAO instance = new ProductDAO();
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String userpass = "tiger";

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

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, userpass);
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}
	
	public void register(ProductVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt =null;
		try {
			con =getConnection();
			String sql="INSERT INTO MVC_PRODUCT(ID,NAME,MAKER,PRICE,REGDATE) VALUES(MVC_PRODUCT_SEQ.NEXTVAL,?,?,?,SYSDATE)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setInt(3, vo.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(null, pstmt, con);
		}
	}
	
	public ArrayList<ProductVO> list() throws SQLException{
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		ArrayList<ProductVO> list= new ArrayList<ProductVO>();
		try {
			con =getConnection();
			String sql="SELECT ID,NAME,TO_CHAR(REGDATE,'YYYY-MM-DD') FROM MVC_PRODUCT ORDER BY ID DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setId(rs.getString("ID"));
				vo.setName(rs.getString("NAME"));
				vo.setRegDate(rs.getString(3));
				list.add(vo);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	public ProductVO findProductById(String id) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		ProductVO vo =null;
		try {
			con = getConnection();
			String sql="SELECT ID,NAME,MAKER,PRICE,REGDATE FROM MVC_PRODUCT WHERE ID =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				vo = new ProductVO(rs.getString("ID"),rs.getString("NAME"),rs.getString("MAKER"),rs.getInt("PRICE"),rs.getString("REGDATE"));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}

}
