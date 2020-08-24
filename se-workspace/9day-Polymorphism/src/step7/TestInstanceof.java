package step7;

class Employee {

}

class Engineer extends Employee {

}

class Manager extends Employee {

}

class Secreatary extends Employee {

}

public class TestInstanceof {

	public static void main(String[] args) {
		//instanceof 연산자 : is a  관계가 성립되면 true를 반환
		Employee e =new Manager();
		if(e instanceof Manager) { // true
			System.out.println("관리자");
		}
		if(e instanceof Secreatary) { // false
			System.out.println("비서");
		}
		if(e instanceof Employee) { // true Manager is a Employee
			System.out.println("사원");
		}
	}

}
