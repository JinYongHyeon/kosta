package test;

import model.Employee;
import model.Info;
import model.Student;
import model.Teacher;
import service.SchoolService;

public class TestSchool {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		Info sc;
		// ArrayList<School> list = new ArrayList<School>();
		System.out.println("*****������ ���*****");
		service.insert(new Student("01064669916", "������", "����", "01"));
		service.insert(new Teacher("01072449933", "ȫ�浿", "��ȯ������", "Java"));
		service.insert(new Teacher("01072449933", "��ȣ��", "����", "Spring"));
		service.insert(new Employee("01033243324", "�տ���", "����", "����"));
		System.out.println("*****������ ��ü �˻�*****");
		service.selectAll();
		System.out.println("*****������ �˻�*****");
		sc = service.	select("01064669916");
		System.out.println(sc);
		System.out.println("*****������ ����*****");
		sc = service.delete("01072449933");
		System.out.println("���� �� ������: " +sc);
		System.out.println("*****������ ��ü �˻�*****");
		service.selectAll();
	}

}
