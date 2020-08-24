package step6;
//java.lang.Objet는 모든 클래스의 root 클래스
//별도의 상속 표현이 없으면 자동으로 extends Object 된다.
public class Employee {
	private String empNo;
	private String name;
	private int salary;
	
	
	public Employee(String empNo, String name, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
