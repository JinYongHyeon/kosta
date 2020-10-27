package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.net.aso.p;

public class MemberDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "scott";
	private String password = "tiger";

	public MemberDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public int getAllMemberCount() throws SQLException {
		int count = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, userName, password);
			String sql = "SELECT COUNT(*) FROM WEB_MEMBER";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}

		} finally {
			closeAll(rs, pstmt, con);
		}
		return count;
	}

	public MemberVO findMemberById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try {
			con = DriverManager.getConnection(dbUrl, userName, password);
			String sql = "SELECT ID,PASSWORD,NAME,ADDRESS FROM WEB_MEMBER WHERE ID=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO(rs.getString("ID"), rs.getString("PASSWORD"), rs.getString("NAME"),
						rs.getString("ADDRESS"));
			}

		} finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}

}
