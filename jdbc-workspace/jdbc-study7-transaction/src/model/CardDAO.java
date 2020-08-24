package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DbInfo;

/**
 * 카드와 포인트 정보를 함꼐 등록하는 메서드 구현 -> 트랜잭션 처리의 필요성을 확인
 * 
 * @author kosta
 *
 */
public class CardDAO {
	public CardDAO() throws ClassNotFoundException {
		Class.forName(DbInfo.DRIVER_NAME);
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {

		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}
	/*
	 * CardDAO1 에서는 카드가 등록되고, 포인트 등록시 에러가 발생
	 */
	public void registerCardAndPoint(String id, String name, String pointType, int point) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		int result2 = 0;
		try {
		con= getConnection();
		//트랜잭션 처리를 위해 오토커밋 모드를 해제한다.
		con.setAutoCommit(false);
		String insertCardSql = "INSERT INTO CARD(ID,NAME) VALUES(?,?)";
		String insertPointSql = "INSERT INTO POINT(ID,POINT_TYPE,POINT)1VALUES(?,?,?)";
		pstmt = con.prepareStatement(insertCardSql);
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		result = pstmt.executeUpdate();
		System.out.println("card insert success : " + result);
		pstmt.close();
		
		pstmt = con.prepareStatement(insertPointSql);
		pstmt.setString(1, id);
		pstmt.setString(2, pointType);
		pstmt.setInt(3, point);
		result2 = pstmt.executeUpdate();
		System.out.println("point insert success : "+ result2);
		// 카드 발급 작업이 모두 정상적으로 수행되었을 떄 실제 데이터베이스에 정보를 등록
		con.commit();
		System.out.println("카드 발급의 모든 작업이 정상적으로 수행되어 커밋!");
		}catch(Exception e) {
			con.rollback();
			System.out.println("카드 발급 작업시 문제 발생하여 작업 취소하고 되돌린다 ROLLBACK");
			e.printStackTrace();
		}finally {
			closeAll(pstmt, con);
		}
		
	}
	


}
