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
		System.out.println("*****구성원 등록*****");
		service.insert(new Student("01064669916", "진용현", "용인", "01"));
		service.insert(new Teacher("01072449933", "홍길동", "소환사협곡", "Java"));
		service.insert(new Teacher("01072449933", "강호동", "모래판", "Spring"));
		service.insert(new Employee("01033243324", "손오공", "강남", "개발"));
		System.out.println("*****구성원 전체 검색*****");
		service.selectAll();
		System.out.println("*****구성원 검색*****");
		sc = service.	select("01064669916");
		System.out.println(sc);
		System.out.println("*****구성원 삭제*****");
		sc = service.delete("01072449933");
		System.out.println("삭제 한 구성원: " +sc);
		System.out.println("*****구성원 전체 검색*****");
		service.selectAll();
	}

}
