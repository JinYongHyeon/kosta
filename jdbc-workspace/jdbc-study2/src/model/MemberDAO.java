package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * DAO : Data Access Object
 * 데이터베이스 연동 로직을 가지고 있는 객체
 */
public class MemberDAO {

	private String drive = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String id = "scott";
	private String pw = "tiger";

	public MemberDAO() throws ClassNotFoundException { // throws로 예외처리를 위임한다.
		Class.forName(drive);
	}

	/**
	 * 닫아주는 메소드 재사용성 ㄱㄱ
	 * 
	 * @param con
	 * @param pstm
	 * @param rs
	 * @throws SQLException
	 */
	public void clearAll(Connection con, PreparedStatement pstm, ResultSet rs) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstm != null)
			pstm.close();
		if (con != null)
			con.close();
	}
	/*
	 * MemberDAO의 findMemberById(id)를 구현해보는 예제 primary key인 id를 이용해 MEMBER TABLE의
	 * 회원정보가 전달하는 ID에 부합되면 MemberVO 객체를 반환받고 ID에 해당하는 회원이 없으면 null을 반환받는 예제
	 */
	public MemberVO findMemberByID(String id2) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		MemberVO vo2 = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "SELECT * FROM MEMBER WHERE ID=?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id2);
			rs = pstm.executeQuery();

			if (rs.next()) {
				vo2 = new MemberVO(rs.getString("id"), rs.getString("password"), rs.getString("name"),
						rs.getString("address"));
			}
		} finally {
			clearAll(con, pstm, rs);
		}
		return vo2;

	}

	public ArrayList<MemberVO> findMemberByID2(String id2) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "SELECT * FROM MEMBER WHERE ID=?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id2);
			rs = pstm.executeQuery();

			while (rs.next()) {
				list.add(new MemberVO(rs.getString("id"), rs.getString("password"), rs.getString("name"),
						rs.getString("address")));
			}
		} finally {
			clearAll(con, pstm, rs);
		}
		return list;
	}

	public ArrayList<MemberVO> getAllMemberList() throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "SELECT * FROM MEMBER";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				list.add(new MemberVO(rs.getString("id"), rs.getString("password"), rs.getString("name"),
						rs.getString("address")));
			}
		} finally {
			clearAll(con, pstm, rs);
		}
		return list;
	}
	
}
