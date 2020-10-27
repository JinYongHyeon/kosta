package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import oracle.net.aso.d;

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
	
	public MemberVO findMemberById(String id) throws SQLException {
		MemberVO vo = null;
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
				vo = new MemberVO(id,rs.getString("password"),rs.getString("name"), rs.getString("address"));
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
	
	public ArrayList<MemberVO> addressList(String address) throws SQLException{
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		try {
			con =dataSource.getConnection();
			String sql ="SELECT ID,PASSWORD,NAME FROM WEB_MEMBER WHERE ADDRESS=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new MemberVO(rs.getString("ID"),rs.getString("PASSWORD"),rs.getString("NAME"),address));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
}
