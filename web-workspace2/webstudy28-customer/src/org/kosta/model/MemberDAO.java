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
		this.dataSource = DataSourceManger.getInstance().getDataSource();
	}
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null) 
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public int userCount() throws SQLException {
		int count = 0 ;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql ="SELECT COUNT(*) AS COUNT FROM USER_A ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
			}
		}finally{
			closeAll(rs, pstmt, con);
		}
		return count;
	}
	
	public MemberDTO idCheck(String id) throws SQLException{
		MemberDTO vo = null;
		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		try {
			con = dataSource.getConnection();
			StringBuilder sb= new StringBuilder();
			sb.append("SELECT ID,PASSWORD,NAME,ADDRESS,TO_CHAR(BIRTHDAY,'YYYY-MM-DD'),TO_CHAR(REGISTERDATE,'YYYY-MM-DD') FROM USER_A");
			sb.append(" WHERE ID=?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo; 
	}
	
	
	public MemberDTO login(String id,String password) throws SQLException{
		MemberDTO vo = null;
		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		try {
			con = dataSource.getConnection();
			StringBuilder sb= new StringBuilder();
			sb.append("SELECT ID,PASSWORD,NAME,ADDRESS,TO_CHAR(BIRTHDAY,'YYYY-MM-DD'),TO_CHAR(REGISTERDATE,'YYYY-MM-DD HH24:MM:SS') FROM USER_A");
			sb.append(" WHERE ID=? AND PASSWORD=?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo; 
	}
	
	public void userJoin(MemberDTO vo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt =null;
		try {
			con = dataSource.getConnection();
			StringBuilder sb = new StringBuilder();
// 
			sb.append("INSERT INTO USER_A(ID,PASSWORD,NAME,ADDRESS,BIRTHDAY,REGISTERDATE)");
			sb.append(" VALUES(?,?,?,?,TO_DATE(?,'YYYY-MM-DD'),SYSDATE)");
			pstmt = con.prepareStatement(sb.toString());
			System.out.println(vo.getId()+"/"+vo.getPassword()+"/"+vo.getName()+"/"+vo.getAddress()+"/"+vo.getBirthday()+"/");
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.setString(5, vo.getBirthday());
			pstmt.executeUpdate();
		}finally {
			closeAll(null, pstmt, con);
		}
	}
	

}
