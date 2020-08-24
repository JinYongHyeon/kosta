package school.controller;

import java.io.IOException;
import java.util.Scanner;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;
import school.model.Employee;
import school.model.Person;
import school.model.Student;
import school.model.Teacher;
import school.service.SchoolService;

public class SchoolController {

	private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {

		int endPoint = 0;
		try {
			service.loadList();
			while (true) {
				if (endPoint == -1)
					break;
				System.out.println("1.�߰�  2.����  3.����   4 �˻�   5.��üȸ������  6.����");
				String menu = scanner.nextLine();

				switch (menu) {
				case "1":
					insert();
					break;
				case "2":
					delete();
					break;
				case "3":
					update();
					break;
				case "4":
					select();
					break;
				case "5":
					service.selectAll();
					break;
				case "6":
					System.out.println("�л� ���α׷��� �����մϴ�.");
					endPoint = -1;
					break;
				default:
					System.out.println("�߸��� �Է°��Դϴ�!!");
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close();
			try {
				service.saveList();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void insert() {
		String menu = null;
		while (true) {
			System.out.println("�Է��� �������� ������ �����ϼ��� 1.�л�  2.������ 3.����");
			menu = scanner.nextLine();
			if (menu.equals("1") || menu.equals("2") || menu.equals("3")) {
				break;
			} else {
				System.out.println("�л�,������,����(1~3��) �� �ϳ��� �޴��� �����ϼ���!");
			}
		}
		String tel = null;
		while (true) {
			System.out.println("1.��ȭ��ȣ�� �Է��ϼ���!");
			tel = scanner.nextLine();
			try {
				service.findPersonByTel(tel);
				System.out.println("��ȭ��ȣ�� �ߺ��˴ϴ�. �ٽ� �Է��ϼ���!");
			} catch (PersonNotFoundException pnfe) {
				break;
			}
		}
		System.out.println("2.�̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("3.�ּҸ� �Է��ϼ���!");
		String address = scanner.nextLine();
		Person person = null;
		while (true) {
			switch (menu) {
			case "1":
				System.out.println("4.�й��� �Է��ϼ���");
				String stuId = scanner.nextLine();
				person = new Student(tel, name, address, stuId);
				break;
			case "2":
				System.out.println("4.������ �Է��ϼ���");
				String subject = scanner.nextLine();
				person = new Teacher(tel, name, address, subject);
				break;
			default:
				System.out.println("4.�μ��� �Է��ϼ���");
				String department = scanner.nextLine();
				person = new Employee(tel, name, address, department);
				break;
			}
			try {
				service.insert(person);
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void select() {
		try {
			System.out.println("��ȸ�� �������� ��ȭ��ȣ�� �Է��ϼ���");
			String selectTel = scanner.nextLine();
			System.out.println("��ȸ ����  : " + service.findPersonByTel(selectTel));
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete() {
		try {
			System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���");
			String deleteTel = scanner.nextLine();
			System.out.println("���� ����  : " + service.delete(deleteTel));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void update() {
		System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���");
		String tel = null;
		Person person = null;
		while (true) {
			try {
				tel = scanner.nextLine();
				person = service.findPersonByTel(tel);
				System.out.println("���� �� ���� : " + person);
				break;
			} catch (PersonNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		String menu = person.getClass().getName();

		System.out.println("2.�̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("3.�ּҸ� �Է��ϼ���!");
		String address = scanner.nextLine();

		switch (menu) {
		case "school.model.Student":
			System.out.println("���� �й��� �Է��ϼ���");
			String stuId = scanner.nextLine();
			person = new Student(tel, name, address, stuId);

			break;
		case "school.model.Teacher":
			System.out.println("���� ������ �Է��ϼ���");
			String subject = scanner.nextLine();
			person = new Teacher(tel, name, address, subject);
			break;

		default:
			System.out.println("���� �μ��� �Է��ϼ���.");
			String department = scanner.nextLine();
			person = new Employee(tel, name, address, department);
			break;
		}
		try {
			service.update(person);
		} catch (PersonNotFoundException e) {
			e.printStackTrace();
		}

	}

}
