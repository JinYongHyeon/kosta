package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	private void closeAll(ResultSet rs,PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!= null)
			rs.close();
		if(pstmt !=null)
			pstmt.close();
		if(con  != null)
			con.close();
	}
	
	public MemberVO login(String id, String pass) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		MemberVO mvo = null;
		try {
			con= dataSource.getConnection();
			String sql="SELECT id,password,name FROM board_member WHERE id=? AND password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mvo = new MemberVO(rs.getString("id"),rs.getString("password"),rs.getString("name"));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return mvo;
	}
}
