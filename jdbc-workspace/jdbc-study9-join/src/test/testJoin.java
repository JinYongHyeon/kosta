package test;

import java.sql.SQLException;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class testJoin {

	public static void main(String[] args) {
		 
		/*
		 * k_employee 와 department 테이블을 조합(결합)해서
		 * 1번 사원번호를 가진 사원의 사원정보와 부서정보를 조회하고자 한다.
		 * (이 형태는 빈번하게 사용되고, 때로는 사원정보만 조회해서 화면 제공하고 때로는 부서정보만 조회해서 화면이 제공되기도 한다.)
		 * ->UML(Class Diagram)을 정의해보자.
		 */
		
		//empno에 해당하는 ename,sal,deptno,dname,loc,tel을  조회하여 출력
		EmployeeDTO e = null;
		String empno="1";
		try {
			EmployeeDAO dao = new EmployeeDAO();
			e = dao.findEmpAndDeptInfo(empno);
			System.out.println("사원번호 : "+empno);
			System.out.println("사원명 : "+e.getEname());
			System.out.println("사원월급 : "+e.getSal());
			System.out.println("부서번호 : "+e.getDepartmentDTO().getDepntno());
			System.out.println("부서명 : "+e.getDepartmentDTO().getDname());
			System.out.println("지역 : "+e.getDepartmentDTO().getLoc());
			System.out.println("부서전화번호 : "+e.getDepartmentDTO().getTel());
		} catch (SQLException e1) {
			e1.printStackTrace();
		} //join sql 실행해서 결과를 반환
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
