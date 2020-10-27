package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String userpass = "tiger";

	private MemberDAO() {
	}

	public static MemberDAO getInstance() {
		return instance;
	}

	public void cloasAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void cloasAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public MemberVO findMemberById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "SELECT ID,PASSWORD,NAME,ADDRESS FROM WEB_MEMBER WHERE ID =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new MemberVO(rs.getString("ID"), rs.getString("PASSWORD"), rs.getString("NAME"),
						rs.getString("ADDRESS"));
			}
		} finally {
			cloasAll(rs, pstmt, con);
		}
		return vo;
	}

	public MemberVO login(MemberVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO memberVO = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "SELECT ID,PASSWORD,NAME,ADDRESS FROM WEB_MEMBER WHERE ID=? AND PASSWORD=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				memberVO = new MemberVO();
				memberVO.setId(rs.getString("ID"));
				memberVO.setPassword(rs.getString("PASSWORD"));
				memberVO.setName(rs.getString("NAME"));
				memberVO.setAddress(rs.getString("ADDRESS"));
			}
		} finally {
			cloasAll(rs, pstmt, con);
		}
		return memberVO;
	}

	public void MemberUpdate(MemberVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int index =0;

		try {
			con = DriverManager.getConnection(url,username,userpass);
			con.setAutoCommit(false);
			StringBuilder sb= new StringBuilder();
			sb.append("UPDATE WEB_MEMBER SET PASSWORD =?,NAME=?,ADDRESS=? WHERE ID =?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getPassword());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getId());
			pstmt.executeUpdate();
			con.commit();
		}catch(Exception e) {
				 con.rollback();
				 throw e;
		} finally {
			cloasAll(pstmt, con);
		}
	}
	
	public void register(MemberVO vo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt =null;
		try {
			con =DriverManager.getConnection(url,username,userpass);
			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO WEB_MEMBER(ID,PASSWORD,NAME,ADDRESS)");
			sb.append(" VALUES(?,?,?,?)");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.executeUpdate();
		}finally {
			cloasAll(pstmt, con);
		}
	}

}
