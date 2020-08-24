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
				System.out.println("1.추가  2.삭제  3.수정   4 검색   5.전체회원보기  6.종료");
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
					System.out.println("학사 프로그램을 종료합니다.");
					endPoint = -1;
					break;
				default:
					System.out.println("잘못된 입력값입니다!!");
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
			System.out.println("입력할 구성원의 종류를 선택하세요 1.학생  2.선생님 3.직원");
			menu = scanner.nextLine();
			if (menu.equals("1") || menu.equals("2") || menu.equals("3")) {
				break;
			} else {
				System.out.println("학생,선생님,직원(1~3번) 중 하나의 메뉴를 선택하세요!");
			}
		}
		String tel = null;
		while (true) {
			System.out.println("1.전화번호를 입력하세요!");
			tel = scanner.nextLine();
			try {
				service.findPersonByTel(tel);
				System.out.println("전화번호가 중복됩니다. 다시 입력하세요!");
			} catch (PersonNotFoundException pnfe) {
				break;
			}
		}
		System.out.println("2.이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("3.주소를 입력하세요!");
		String address = scanner.nextLine();
		Person person = null;
		while (true) {
			switch (menu) {
			case "1":
				System.out.println("4.학번을 입력하세요");
				String stuId = scanner.nextLine();
				person = new Student(tel, name, address, stuId);
				break;
			case "2":
				System.out.println("4.과목을 입력하세요");
				String subject = scanner.nextLine();
				person = new Teacher(tel, name, address, subject);
				break;
			default:
				System.out.println("4.부서을 입력하세요");
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
			System.out.println("조회할 구성원의 전화번호를 입력하세요");
			String selectTel = scanner.nextLine();
			System.out.println("조회 정보  : " + service.findPersonByTel(selectTel));
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void delete() {
		try {
			System.out.println("삭제할 구성원의 전화번호를 입력하세요");
			String deleteTel = scanner.nextLine();
			System.out.println("삭제 정보  : " + service.delete(deleteTel));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void update() {
		System.out.println("수정할 구성원의 전화번호를 입력하세요");
		String tel = null;
		Person person = null;
		while (true) {
			try {
				tel = scanner.nextLine();
				person = service.findPersonByTel(tel);
				System.out.println("수정 할 정보 : " + person);
				break;
			} catch (PersonNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		String menu = person.getClass().getName();

		System.out.println("2.이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("3.주소를 입력하세요!");
		String address = scanner.nextLine();

		switch (menu) {
		case "school.model.Student":
			System.out.println("수정 학번을 입력하세요");
			String stuId = scanner.nextLine();
			person = new Student(tel, name, address, stuId);

			break;
		case "school.model.Teacher":
			System.out.println("수정 과목을 입력하세요");
			String subject = scanner.nextLine();
			person = new Teacher(tel, name, address, subject);
			break;

		default:
			System.out.println("수정 부서을 입력하세요.");
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
