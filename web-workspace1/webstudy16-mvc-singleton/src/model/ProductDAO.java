package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	/*
	 * Singleton Design Pattern 적용 1. private 생성자s2. private static 변수에 자신의 객체를 생성
	 * 3. public static method(getInstance())로 공유
	 */
	private static ProductDAO dao = new ProductDAO();
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "scott";
	private String password = "tiger";

	private ProductDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static ProductDAO getInstance() {
		return dao;
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public int productSelectAllCount() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		try {
			con = DriverManager.getConnection(dbUrl, userName, password);
			String sql = "SELECT COUNT(*) FROM WEB_PRODUCT";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstmt, con);

		}
		return count;
	}

	public ProductVO findProductById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProductVO vo = null;
		try {
			con =DriverManager.getConnection(dbUrl,userName,password);
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT NAME,MAKER,PRICE FROM WEB_PRODUCT");
			sb.append(" WHERE ID =?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
			 vo = new ProductVO(id,rs.getString("NAME"), rs.getString("MAKER"), rs.getInt("PRICE"));	
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	
	public ArrayList<ProductVO> productSelectAllList() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		try {
			con =DriverManager.getConnection(dbUrl,userName,password);
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT ID,NAME,MAKER,PRICE FROM WEB_PRODUCT");
			sb.append(" ORDER BY ID DESC");
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
		ProductVO vo  = new ProductVO(rs.getString("id"),rs.getString("NAME"), rs.getString("MAKER"), rs.getInt("PRICE"));
				 list.add(vo);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}

}
