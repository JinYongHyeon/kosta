package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NoticeDAO {
	private static NoticeDAO dao = new NoticeDAO();

	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "scott";
	private String password = "tiger";

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	private NoticeDAO() {

	}
	
	public static NoticeDAO getInstance() {
		return dao;
	}

	public ArrayList<NoticeVO> noticeSelect() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<NoticeVO> list= new ArrayList<NoticeVO>();
		try {
			con = DriverManager.getConnection(dbUrl, userName, password);
			String sql = "SELECT NO,TITLE,CONTENT,WRITER,NOTICEDATE,POINT FROM NOTICE";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				NoticeVO vo = new NoticeVO(rs.getString("NO"),rs.getString("TITLE"),
				rs.getString("CONTENT"),rs.getString("WRITER"),rs.getString("NOTICEDATE"),rs.getInt("POINT"));
				list.add(vo);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	public NoticeVO noticeFindSelect(String no) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		NoticeVO vo= null;
		try {
			con = DriverManager.getConnection(dbUrl, userName, password);
			String sql = "SELECT TITLE,CONTENT,WRITER,NOTICEDATE,POINT FROM NOTICE WHERE NO = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new NoticeVO(no,rs.getString("TITLE"),
				rs.getString("CONTENT"),rs.getString("WRITER"),rs.getString("NOTICEDATE"),rs.getInt("POINT"));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}

}
