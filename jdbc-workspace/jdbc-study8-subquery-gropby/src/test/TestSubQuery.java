package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeVO;

public class TestSubQuery {

	public static void main(String[] args) {
		/*
		 * �ѹ��� �μ��� ����� �� ���� ���� ������ ���� ����� ������ ��ȸ
		 */
		try {
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<EmployeeVO> list = dao.getEmbyLowSal("�ѹ�");
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
