package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DbInfo;

/**
 * ī��� ����Ʈ ������ �Բ� ����ϴ� �޼��� ���� -> Ʈ����� ó���� �ʿ伺�� Ȯ��
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
	 * CardDAO1 ������ ī�尡 ��ϵǰ�, ����Ʈ ��Ͻ� ������ �߻�
	 */
	public void registerCardAndPoint(String id, String name, String pointType, int point) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		int result2 = 0;
		try {
		con= getConnection();
		//Ʈ����� ó���� ���� ����Ŀ�� ��带 �����Ѵ�.
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
		// ī�� �߱� �۾��� ��� ���������� ����Ǿ��� �� ���� �����ͺ��̽��� ������ ���
		con.commit();
		System.out.println("ī�� �߱��� ��� �۾��� ���������� ����Ǿ� Ŀ��!");
		}catch(Exception e) {
			con.rollback();
			System.out.println("ī�� �߱� �۾��� ���� �߻��Ͽ� �۾� ����ϰ� �ǵ����� ROLLBACK");
			e.printStackTrace();
		}finally {
			closeAll(pstmt, con);
		}
		
	}
	


}
