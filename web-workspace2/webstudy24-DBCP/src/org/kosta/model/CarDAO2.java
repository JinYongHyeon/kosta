package org.kosta.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

/*	
 * 
 * DBCP를 이요해 컨넥션을 빌려고 반납받는다.
 * 
 *  DAO : Data Access Object
 *  
 *  DAO에 Singleton Design Pattern을 적용한다
 *  시스템 상에서 단 한번 객체 생성하고 여러 곳에서 공유해서 사용하도록 한다.
 */

public class CarDAO2 {

	private static CarDAO2 instance = new CarDAO2();
	private DataSource dataSource;

	// 생성자에 private을 명시하여 외부에서 생성하지 못하게 막는다.
	private CarDAO2() {
		this.dataSource= DataSourceManager.getInstance().getDataSource();
	}

	// public static 메서드로 외부에 공유한다.
	public static CarDAO2 getInstance() {
		return instance;
	}

	
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();//컨넥션을 dbcp에 반납한다(소멸시키는게 아님)
	}

	public CarDTO findCarByNo(String no) throws SQLException {
		CarDTO car = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
			//dbcp로부터 컨넥션을 빌려온다. ( 생성하는 것이 아님)
			con =  dataSource.getConnection();
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
	
	public ArrayList<CarDTO> getAllCarList() throws SQLException{
		ArrayList<CarDTO> list = new ArrayList<CarDTO>();
		Connection con= null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		try {
			con = dataSource.getConnection();
			String sql ="SELECT car_no,model FROM mvc_car ORDER BY car_no DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CarDTO dto = new CarDTO();
				dto.setCarNO(rs.getString("car_no"));
				dto.setModel(rs.getString("model"));
				list.add(dto);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}
