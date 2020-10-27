package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	private DataSource dataSource;
	
	private MemberDAO() {
		dataSource = DataSourceManager.getInstance().getDataSource();		
	}
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public void closeAll(ResultSet rs ,PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!= null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	
	public MemberDTO findMemberById(String id) throws SQLException {
		MemberDTO vo = null;
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT PASSWORD,NAME,ADDRESS FROM WEB_MEMBER WHERE ID=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new MemberDTO(id,rs.getString("password"),rs.getString("name"), rs.getString("address"));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	
	public ArrayList<String> getAddressKind() throws SQLException{
		ArrayList<String> list = new ArrayList<String>();
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT DISTINCT(ADDRESS) FROM WEB_MEMBER";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	public ArrayList<MemberDTO> addressList(String address) throws SQLException{
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		try {
			con =dataSource.getConnection();
			String sql ="SELECT ID,NAME FROM WEB_MEMBER WHERE ADDRESS=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO vo = new MemberDTO();
				vo.setId(rs.getString("ID"));
				vo.setName(rs.getString("NAME"));
				list.add(vo);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	public int getMemberTotalCount() throws SQLException {
		int count =0;
		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		try {
			con= dataSource.getConnection();
			String sql= "SELECT COUNT(*) FROM WEB_MEMBER";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return count;
	}
	
	public MemberDTO login(String id,String password) throws SQLException {
		MemberDTO vo = null;
		Connection con =null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT ID,PASSWORD,NAME,ADDRESS FROM WEB_MEMBER WHERE ID=? AND PASSWORD=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setNString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new MemberDTO(rs.getString("ID"),rs.getString("PASSWORD") ,rs.getString("NAME"), rs.getString("ADDRESS"));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	
	public void reigster(MemberDTO vo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt = null;
		try {
			con = dataSource.getConnection();
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
			closeAll(null, pstmt, con);
		}
	}
	
	public void updateMember(MemberDTO vo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt =null;
		try {
			con =dataSource.getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("UPDATE WEB_MEMBER SET PASSWORD=?, NAME=?, ADDRESS=? WHERE ID =?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getPassword());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getId());
			pstmt.executeUpdate();
			}finally {
			closeAll(null, pstmt, con);
		}
	}
	
}
