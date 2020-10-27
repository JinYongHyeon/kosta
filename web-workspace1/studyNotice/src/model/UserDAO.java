package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private static UserDAO dao = new UserDAO();
	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "scott";
	private String password = "tiger";

	private UserDAO() {
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public static UserDAO getInstance() {
		return dao;
	}

	public boolean loginCheck(String id, String password) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean check = false;
		try {
			con = DriverManager.getConnection(dbUrl, userName,  this.password);
			String sql="SELECT ID,PASSWORD FROM USER_NOTICE WHERE ID=? AND PASSWORD=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next())check = true;
		} finally {
			closeAll(rs, pstmt, con);
		}
		return check;
	}
}
