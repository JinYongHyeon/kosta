package test;

import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class testJoin2 {

	public static void main(String[] args) {

		/*
		 * k_employee 와 department 테이블을 조합(결합)해서 1번 사원번호를 가진 사원의 사원정보와 부서정보를 조회하고자 한다.
		 * (이 형태는 빈번하게 사용되고, 때로는 사원정보만 조회해서 화면 제공하고 때로는 부서정보만 조회해서 화면이 제공되기도 한다.)
		 * ->UML(Class Diagram)을 정의해보자.
		 */

		// empno에 해당하는 ename,sal,deptno,dname,loc,tel을 조회하여 출력
		try {
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<EmployeeDTO> list = dao.findEmpAndDeptInfo();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i)); // 사원과 사원의 속한 부서 정보가 출력
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
