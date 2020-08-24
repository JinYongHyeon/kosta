package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * DAO : Data Access Object
 */
public class GuestBookDAO {
	private String drive = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String id = "scott";
	private String pw = "tiger";

	public GuestBookDAO() throws ClassNotFoundException {
		super();
		Class.forName(drive);
	}

	public void closeAll(PreparedStatement pstm, Connection con) throws SQLException {
		if (pstm != null)
			pstm.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstm, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstm, con);
	}

	public void register(GuestBookDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			// String sql = "INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES" +
			// "(guestbook_seq.nextval,?,?)";
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES ");
			sql.append("(guestbook_seq.nextval,?,?)");
			pstm = con.prepareStatement(sql.toString());
			pstm.setString(1, dto.getTitle());
			pstm.setString(2, dto.getContent());
			int result = pstm.executeUpdate();
			System.out.println("결과  row : " + result);
		} finally {
			closeAll(pstm, con);
		}

	}

	public ArrayList<GuestBookDTO> getAllGuestBookListOrderByNoDesc() throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<GuestBookDTO> list = new ArrayList<GuestBookDTO>();
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			// String sql = "SELECT guestbook_no,title,content FROM GUESTBOOK ORDER BY
			// guestbook_no DESC";
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT guestbook_no,title,content FROM GUESTBOOK ");
			sql.append("ORDER BY guestbook_no DESC");
			pstm = con.prepareStatement(sql.toString());
			rs = pstm.executeQuery();
			while (rs.next()) {
				list.add(new GuestBookDTO(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} finally {
			closeAll(rs, pstm, con);
		}
		return list;
	}

	// 시퀀스 현재값을 조회하는 메소드
	public int getCurrentSequence() throws SQLException {
		int seq = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "SELECT guestbook_seq.currval FROM DUAL";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				seq = rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return seq;
	}
// 시퀀스의 currval 현재값의 nextval한 컨넥션 내에서만 사용가능하다.
	public void register2(GuestBookDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int seq = 0;
		try {

			con = DriverManager.getConnection(dbUrl, id, pw);
			// String sql = "INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES" +
			// "(guestbook_seq.nextval,?,?)";
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO GUESTBOOK(guestbook_no,title,content) VALUES ");
			sql.append("(guestbook_seq.nextval,?,?)");
			pstm = con.prepareStatement(sql.toString());
			pstm.setString(1, dto.getTitle());
			pstm.setString(2, dto.getContent());
			int result = pstm.executeUpdate();
			pstm.close();

			String sql2 = "SELECT guestbook_seq.currval FROM DUAL";
			pstm = con.prepareStatement(sql2);
			rs = pstm.executeQuery();
			while (rs.next()) {

				seq = rs.getInt(1);
				dto.setGuestBookNo(seq);
			}
			System.out.println("결과  row : " + result);
		} finally {
			closeAll(rs, pstm, con);
		}

	}

}
