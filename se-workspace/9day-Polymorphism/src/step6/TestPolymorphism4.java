package step6;

class Employee {

}

class Engineer extends Employee {

}

class Manager extends Employee {

}

class Secreatary extends Employee {

}

class CompanyService {
//다형성이 적용되므로 사원의 종류가 여러개라도 하나의 메서드에서 모두 처리 할 수 있다.
	public void register(Employee employee) {
		//instanceof 연산자를 이용해 객체의 타입을 확인
		if (employee instanceof Engineer) {
			System.out.println(employee + " 킹지니어 등록완료");
		} else if(employee instanceof Manager) {
			System.out.println(employee + " 매니저 등록완료");
		} else if(employee instanceof Secreatary) {
			System.out.println(employee + " 비서 등록완료");
		} else {
			System.out.println(employee + " 일반사원입니다.");
		}
	}

}

public class TestPolymorphism4 {

	public static void main(String[] args) {
		CompanyService service = new CompanyService();
		service.register(new Employee());
		service.register(new Engineer());
		service.register(new Manager());
		service.register(new Secreatary());
	}

}
