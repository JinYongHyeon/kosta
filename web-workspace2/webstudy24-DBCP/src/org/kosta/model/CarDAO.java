package org.kosta.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*	
 *  
 *  DAO : Data Access Object
 *  
 *  DAO에 Singleton Design Pattern을 적용한다
 *  시스템 상에서 단 한번 객체 생성하고 여러 곳에서 공유해서 사용하도록 한다.
 */

public class CarDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "scott";
	private String userPass = "tiger";
	// 클래스 로딩시에 딱 한번 객체 생성해서 method area(or class area)의 static 변수영역에 dao의 주소
	// 값을 저장
	private static CarDAO instance = new CarDAO();

	// 생성자에 private을 명시하여 외부에서 생성하지 못하게 막는다.
	private CarDAO() {
	}

	// public static 메서드로 외부에 공유한다.
	public static CarDAO getInstance() {
		return instance;
	}

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl, userName, userPass);
	}

	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public CarDTO findCarByNo(String no) throws SQLException {
		CarDTO car = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
			con = getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT car_no,model,price FROM mvc_car");
			sb.append(" WHERE car_no =?");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				car = new CarDTO(rs.getString("car_no"),rs.getString("model"),rs.getInt("price"));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return car;
	}
}
