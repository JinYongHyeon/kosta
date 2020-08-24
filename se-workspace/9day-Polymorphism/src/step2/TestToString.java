package step2;

class Employee extends Test {
	@Override
	public void eat() {
		System.out.println("1");
	}
}

class Test {
	public void eat() {
		System.out.println("2");
	}
}

class Employee2 {
	private String empId;
	private String name;

	public Employee2(String empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/*
	 * 어노테이션 : 의미있는 주석
	 * 
	 * @Override 은 오버라이딩 규칙에 어긋나면 ERROR를 발생시킨다.
	 */
	@Override
	public String toString() {
		return "등수 " + empId + " " + name + "님 안녕하세요.";
	}
}

class Employee3 {

	@Override
	public String toString() {
		return super.toString();
	}

}

public class TestToString {

	public static void main(String[] args) {

		Employee e = new Employee();

		Test t = new Test();

		t = e;

		t.eat();

		// Object 자식이므로 toString() 사용가능 Employee 객체 주소값이 반환
		System.out.println(e.toString());
		// println 내부에서 참조변수가 들어오면 toString()을 호출하므로 아래와 같이 사용할 수 있다.
		System.out.println(e);

		Employee2 e2 = new Employee2("1", "홍길동");
		System.out.println(e2);
	}

}
