package test;

import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class testJoin2 {

	public static void main(String[] args) {

		/*
		 * k_employee �� department ���̺��� ����(����)�ؼ� 1�� �����ȣ�� ���� ����� ��������� �μ������� ��ȸ�ϰ��� �Ѵ�.
		 * (�� ���´� ����ϰ� ���ǰ�, ���δ� ��������� ��ȸ�ؼ� ȭ�� �����ϰ� ���δ� �μ������� ��ȸ�ؼ� ȭ���� �����Ǳ⵵ �Ѵ�.)
		 * ->UML(Class Diagram)�� �����غ���.
		 */

		// empno�� �ش��ϴ� ename,sal,deptno,dname,loc,tel�� ��ȸ�Ͽ� ���
		try {
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<EmployeeDTO> list = dao.findEmpAndDeptInfo();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i)); // ����� ����� ���� �μ� ������ ���
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}