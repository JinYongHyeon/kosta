package step3;

public class TestCompnayService {

	public static void main(String[] args) {

		
		CompanyService service = new CompanyService();
		
		/*연봉을 계산해서 출력하는 메소드 (salary * 12) 단  엔지니어 salary bonus * 12 */
		service.printAnnualSalary(new Employee("손오공", 1000));
		service.printAnnualSalary(new Engineer("진용현", 9000,"java",5000));
		service.printAnnualSalary(new Manager("홍길동", 1000,"개발부"));
		/*
		service.printDetailInfo(new Employee("손오공", 1000));
		service.printDetailInfo(new Engineer("진용현", 9000,"java",5000));
		service.printDetailInfo(new Manager("홍길동", 1000,"개발부"));
		*/
	}

}
