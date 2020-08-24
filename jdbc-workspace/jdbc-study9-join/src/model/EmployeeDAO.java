package model;
//packge model은 back-end 성향들의 클래스들이 모임

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.EmployeeDTO;

public class EmployeeDAO {
	String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String USER="scott";
	String PASS="tiger";
	
	public EmployeeDAO() throws ClassNotFoundException {
		Class.forName(DRIVER_NAME);
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,USER,PASS);
	}
	
	public void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) throws SQLException {
		if(rs != null)
			rs.close();
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			con.close();
	}
	/*
	 * SELECT E.*,D.*
FROM K_EMPLOYEE E, DEPARTMENT D
WHERE E.EMPNO = 1 AND E.DEPTNO = D.DEPTNO
	 * 
	 * */
	public EmployeeDTO findEmpAndDeptInfo(String empno) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeDTO dto = null;
		try {
			con = getConnection();
			//empno에 해당하는 ename,sal,deptno,dname,loc,tel을  조회하여 출력
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT E.ENAME,E.SAL,D.DEPTNO,D.DNAME,D.LOC,D.TEL");
			sb.append(" FROM K_EMPLOYEE E, DEPARTMENT D");
			sb.append(" WHERE E.EMPNO = ? AND E.DEPTNO = D.DEPTNO");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, empno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DepartmentDTO dedto = new DepartmentDTO(rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				dto = new EmployeeDTO(empno, rs.getString(1), rs.getInt(2),dedto);
			}
		}finally {
			closeAll(con, pstmt, rs);
		}
		return dto;
	}

	public ArrayList<EmployeeDTO> findEmpAndDeptInfo() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		try {
			con = getConnection();
			StringBuilder sb= new StringBuilder();
			sb.append("SELECT E.EMPNO,E.ENAME,E.SAL,D.DEPTNO,D.DNAME,D.LOC,D.TEL");
			sb.append(" FROM K_EMPLOYEE E, DEPARTMENT D");
			sb.append(" WHERE E.DEPTNO = D.DEPTNO");
			sb.append(" ORDER BY E.EMPNO ASC");
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DepartmentDTO dedto = new DepartmentDTO(
						rs.getString("deptno"),
						rs.getString("dname"),
						rs.getString("loc"),
						rs.getString("tel"));
				EmployeeDTO emdto = new EmployeeDTO(
						rs.getString("EMPNO"),
						rs.getString("ename"),
						rs.getInt("sal"),dedto);
				list.add(emdto);
			}
		}finally {
			closeAll(con, pstmt, rs);
		}
		return list;
	}

}
