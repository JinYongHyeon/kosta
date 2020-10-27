package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();
	private DataSource dataSource;
	
	private BoardDAO() {
		dataSource = DataSourceManager.getInstance().getDataSource();		
	}
	public static BoardDAO getInstance() {
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
	
	public ArrayList<PostVO> getAllPostList() throws SQLException{
		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		ArrayList<PostVO> boardList = new ArrayList<PostVO>();
		try {
			con =dataSource.getConnection();
			StringBuilder sb= new StringBuilder();
			sb.append("SELECT b.no,b.title,m.id,m.name,TO_CHAR(b.time_posted,'YYYY-MM-DD') AS 작성일,b.hits FROM");
			sb.append(" board b, board_member m");
			sb.append(" WHERE b.id=m.id");
			sb.append(" ORDER BY no DESC");
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PostVO pVO = new PostVO();
				pVO.setNo(rs.getString("no"));
				pVO.setTitle(rs.getString("title"));
				//작성자
				MemberVO mvo = new MemberVO();
				mvo.setId(rs.getString("id"));
				mvo.setName(rs.getString("name"));
			
				pVO.setMebmerVO(mvo);	
				
				pVO.setTimePosted(rs.getString("작성일"));
				pVO.setHits(rs.getInt("hits"));
				
				boardList.add(pVO);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return boardList;
	}
	
	public PostVO getPostDetail(String no) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt= null;
		ResultSet rs=null;
		PostVO pvo = null;
		try {
			//게시물번호, 제목, 작성자(id), 작성일시, 조회수, 게시물 본문내용이 제공된다
			con =dataSource.getConnection();
			StringBuilder sb= new StringBuilder();
			sb.append("SELECT b.no,b.title,m.id,m.name,TO_CHAR(b.time_posted,'YYYY-MM-DD HH24:MI:SS') AS 작성일,b.hits, b.content FROM");
			sb.append(" board b, board_member m");
			sb.append(" WHERE b.id=m.id AND b.no=?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				pvo = new PostVO();
				pvo.setNo(rs.getString("no"));
				pvo.setTitle(rs.getString("title"));
				
				MemberVO mvo = new MemberVO();
				mvo.setId(rs.getString("id"));
				mvo.setName(rs.getString("name"));
				pvo.setMebmerVO(mvo);
				
				pvo.setTimePosted(rs.getString("작성일"));
				pvo.setHits(rs.getInt("hits"));
				pvo.setContent(rs.getString("content"));
				
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return  pvo;
	}
	
	public void deletePost(String no) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt =null;
		try {
			con = dataSource.getConnection();
			String sql ="DELETE FROM board WHERE no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);
			pstmt.executeUpdate();
		}finally {
			closeAll(null, pstmt, con);
		}
	}
	
	public void updatePost(PostVO pvo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt =null;
		try {
			con = dataSource.getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("UPDATE board SET title=?,content=? WHERE no =?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1,pvo.getTitle());
			pstmt.setString(2,pvo.getContent());
			pstmt.setString(3, pvo.getNo());
			pstmt.executeUpdate();
		}finally {
			closeAll(null, pstmt, con);
		}
	}
	
	public void updatePostToken(String no) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt =null;
		try {
			con =dataSource.getConnection();
			StringBuffer sb= new StringBuffer();
			sb.append("UPDATE board SET hits=hits+1 WHERE no=?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, no);
			pstmt.executeUpdate();
			
		}finally {
			closeAll(null, pstmt, con);
		}
	}
	
	public String writePost(PostVO pvo) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		String no= null;
		
		try {
			con =dataSource.getConnection();
			StringBuffer sb= new StringBuffer();
			//INSERT INTO board(no,title,content,time_posted,id) VALUES(board_seq.nextval,'타이틀','내용123',SYSDATE,'qwer');
			sb.append("INSERT INTO board(no,title,content,time_posted,id) VALUES(board_seq.nextval,?,?,SYSDATE,?)");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, pvo.getTitle());
			pstmt.setString(2, pvo.getContent());
			pstmt.setString(3, pvo.getMebmerVO().getId());
			pstmt.executeUpdate();
			pstmt.close();
			
			String sql = "SELECT board_seq.currval FROM DUAL";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				no = rs.getString(1);
			}
			
			
		}finally {
			closeAll(rs, pstmt, con);
		}
		return no;
	}
	
	
	
}
