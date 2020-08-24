package step6.ex;

import step6.model.CompnayService;
import step6.model.Employee;
import step6.model.Engineer;
import step6.model.Manager;

public class TestEx {

	public static void main(String[] args) {

		CompnayService service = new CompnayService(100);
		
		System.out.println("*****사원등록시작*****");
		service.add(new Manager("17","홍길동",600,"기획부"));
		service.add(new Engineer("19","진용현",3000,"spring"));
		service.add(new Employee("20","코봉이",500));
		service.add(new Employee("21","아수라",650));
		System.out.println("*****사원등록끝*****");
		System.out.println("*****전체사원정보*****");
		service.printAll();
		System.out.println("*****사원아이디로 검색*****");
		Employee e = service.findById("23");
		System.out.println(e);
		/*
		 * empId : , name : , salary :  , department :  skill :
		 */
		System.out.println("*****사원아이디로 삭제*****");
		service.removeById2("17");
		service.printAll();
		
		
	}

}
