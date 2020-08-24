package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeVO;

public class TestSubQuery {

	public static void main(String[] args) {
		/*
		 * 총무부 부서인 사원들 중 가장 낮은 월급을 받은 사원들 정보를 조회
		 */
		try {
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<EmployeeVO> list = dao.getEmbyLowSal("총무");
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
