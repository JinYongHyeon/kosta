package model;

import service.SchoolService;

/*
 * 비즈니스 로직을 담당하는 SchoolService를 단위 테스트하는 클래스
 */
public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		System.out.println("****구성원 정보 추가 시작****");
		  service.addPerson(new Student("0101231234","정예울","용인","17"));
		  service.addPerson(new Teacher("0101231235","신성호","수지","국어"));
		  service.addPerson(new Student("0101231236","이진욱","수원","16"));
		  service.addPerson(new Employee("0101231237","송영섭","화성","재무부"));
		  service.addPerson(new Student("0101231238","배율휘","용인","18"));
		  service.addPerson(new Teacher("0101231239","강희석","용인","수학"));
		  service.addPerson(new Teacher("0101231239","강희석2","용인","수학"));
		  
		System.out.println("****구성원 정보 추가 완료****");
		service.printAll();
		System.out.println("****구성원 전체 명단****");
		System.out.println(service.findIndexByTel("0101231236"));
		System.out.println(service.findIndexByTel("1231231231231"));
		System.out.println("****삭제 테스트****");
		Person p = service.removePersonByTel("0101231236");
		System.out.println(p);
		  service.addPerson(new Student("0101231234","정예울","용인","17"));
		service.printAll();
		
	}
}
