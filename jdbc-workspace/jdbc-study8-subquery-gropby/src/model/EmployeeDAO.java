package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import common.DbInfo;

public class EmployeeDAO {

	public EmployeeDAO() throws ClassNotFoundException {
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

	public ArrayList<EmployeeVO> getEmbyLowSal(String job) throws SQLException {
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			StringBuilder sb = new StringBuilder();
			// SELECT * FROM EMPLOYEE WHERE SALARY =(SELECT MIN(SALARY) FROM EMPLOYEE WHERE
			// JOB = '총무')
			sb.append("SELECT empno,name,job,salary FROM EMPLOYEE WHERE SALARY");
			sb.append(" = (SELECT MIN(SALARY) FROM EMPLOYEE WHERE JOB = ?)");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, job);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new EmployeeVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}

	public ArrayList<LinkedHashMap<String, Object>> getJobGroupInfoGroupbyJob() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<LinkedHashMap<String, Object>> list = new ArrayList<LinkedHashMap<String, Object>>();
		try {
			con = getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT JOB,MAX(SALARY)  AS HIGHSALARY");
			sb.append(" FROM EMPLOYEE");
			sb.append(" GROUP BY JOB ORDER BY HIGHSALARY");
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 결과의 한 행(ROW)에 대한 정보를 VO 대신 Map으로 담는다.
				LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
				map.put("job", rs.getString(1));
				map.put("highsal", rs.getInt(2));
				list.add(map);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;

	}

	public ArrayList<String> getJobKind() throws SQLException {
		ArrayList<String> list = new ArrayList<String>();
		Connection con = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		try {
			con = getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT DISTINCT(JOB)");
			sb.append(" FROM EMPLOYEE");
			pstmt = con.prepareStatement(sb.toString());
			rs= pstmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}
