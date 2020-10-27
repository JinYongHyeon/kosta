package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

//Employee + Department 통합으로 할때는 통합 명칭으로 해서 만들어도 됨.
public class CompanyDAO {

	private static CompanyDAO instatnce = new CompanyDAO();
	private DataSource dataSource;
	private CompanyDAO() {
		this.dataSource = DataSourceManager.getInstance().getDataSource();
	}

	public static CompanyDAO getInstance() {
		return instatnce;
	}
	public void closeAll(ResultSet rs ,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con != null)
			con.close();
	}
	
	public ArrayList<EmployeeDTO> getAllEmployeeList() throws SQLException {
		ArrayList<EmployeeDTO> empList = new ArrayList<EmployeeDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con =dataSource.getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT e.empno,e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel FROM");
			sb.append(" mvc_employee e,mvc_department d");
			sb.append(" WHERE e.deptno=d.deptno");
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//Employee
				EmployeeDTO empDTO = new EmployeeDTO();
				DepartmentDTO  deptDTO = new DepartmentDTO();
				empDTO.setEmpNo(rs.getString("empno"));
				empDTO.seteName(rs.getString("ename"));
				empDTO.setSal(rs.getInt("sal"));
				//Department
				deptDTO.setDeptno(rs.getString("deptno"));
				deptDTO.setDname(rs.getString("dname"));
				deptDTO.setLoc(rs.getString("loc"));
				deptDTO.setTel(rs.getString("tel"));
				empDTO.setDepartmentDTO(deptDTO);
				empList.add(empDTO);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return empList;
	}
	

}
