package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * DAO : Data Access Object
 * �����ͺ��̽� ���� ������ ������ �ִ� ��ü
 */
public class MemberDAO {

	private String drive = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String id = "scott";
	private String pw = "tiger";

	public MemberDAO() throws ClassNotFoundException { // throws�� ����ó���� �����Ѵ�.
		Class.forName(drive);
	}

	/**
	 * �ݾ��ִ� �޼ҵ� ���뼺 ����
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
	 * MemberDAO�� findMemberById(id)�� �����غ��� ���� primary key�� id�� �̿��� MEMBER TABLE��
	 * ȸ�������� �����ϴ� ID�� ���յǸ� MemberVO ��ü�� ��ȯ�ް� ID�� �ش��ϴ� ȸ���� ������ null�� ��ȯ�޴� ����
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
