package step3;

class Employee {
	private String empId;
	private String name;

	public Employee(String empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class TestToString2 {

	public static void main(String[] args) {
			Employee e = new Employee("23", "열렙전사");
			//toString()을 오버라이딩[재정의]했으므로 오버라이딩한 자신의 메소드가 호출된다.
			//	System.out.println(e) == System.out.println(e.toString());
			System.out.println(e);
	}

}
