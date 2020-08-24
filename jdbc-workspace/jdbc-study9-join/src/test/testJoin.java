package test;

import java.sql.SQLException;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class testJoin {

	public static void main(String[] args) {
		 
		/*
		 * k_employee �� department ���̺��� ����(����)�ؼ�
		 * 1�� �����ȣ�� ���� ����� ��������� �μ������� ��ȸ�ϰ��� �Ѵ�.
		 * (�� ���´� ����ϰ� ���ǰ�, ���δ� ��������� ��ȸ�ؼ� ȭ�� �����ϰ� ���δ� �μ������� ��ȸ�ؼ� ȭ���� �����Ǳ⵵ �Ѵ�.)
		 * ->UML(Class Diagram)�� �����غ���.
		 */
		
		//empno�� �ش��ϴ� ename,sal,deptno,dname,loc,tel��  ��ȸ�Ͽ� ���
		EmployeeDTO e = null;
		String empno="1";
		try {
			EmployeeDAO dao = new EmployeeDAO();
			e = dao.findEmpAndDeptInfo(empno);
			System.out.println("�����ȣ : "+empno);
			System.out.println("����� : "+e.getEname());
			System.out.println("������� : "+e.getSal());
			System.out.println("�μ���ȣ : "+e.getDepartmentDTO().getDepntno());
			System.out.println("�μ��� : "+e.getDepartmentDTO().getDname());
			System.out.println("���� : "+e.getDepartmentDTO().getLoc());
			System.out.println("�μ���ȭ��ȣ : "+e.getDepartmentDTO().getTel());
		} catch (SQLException e1) {
			e1.printStackTrace();
		} //join sql �����ؼ� ����� ��ȯ
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
