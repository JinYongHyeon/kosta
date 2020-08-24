package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieDAO {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String id = "scott";
	String pw = "tiger";

	public MovieDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public void closeAll(ResultSet rs, PreparedStatement pstm, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstm != null)
			pstm.close();
		if (con != null)
			con.close();
	}

	public void closeAll(PreparedStatement pstm, Connection con) throws SQLException {
		if (pstm != null)
			pstm.close();
		if (con != null)
			con.close();
	}

	/*
	 * Connection 
	 * String sql = insert ���� ��������.nextval 
	 * PreparedStatement SQL���� -> executeUpdate
	 * pstm.close(); 
	 * sql : select ��������.currval 
	 * PreparedStatement SQL -> executeQuery();
	 * ResultSet -> vo.setId(); 
	 * closeAll();
	 */
	public void register(MovieVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "INSERT INTO MOVIE(ID,TITLE,attendance)VALUES(movie_seq.nextval,?,?)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, vo.getTitle());
			pstm.setInt(2, vo.getAttendacne());
			int result = pstm.executeUpdate(); //�����°� ������ �ؾ� �Ѵ��� ����� ����
			System.out.println("�Ϸ� �� row : "+ result);
			pstm.close();
			sql = "SELECT movie_seq.currval from dual";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			if(rs.next()) {
				vo.setId(rs.getInt(1));
			}
		} finally {
			closeAll(rs, pstm, con);
		}
	}
}
