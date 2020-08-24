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
	 * ������̼� : �ǹ��ִ� �ּ�
	 * 
	 * @Override �� �������̵� ��Ģ�� ��߳��� ERROR�� �߻���Ų��.
	 */
	@Override
	public String toString() {
		return "��� " + empId + " " + name + "�� �ȳ��ϼ���.";
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

		// Object �ڽ��̹Ƿ� toString() ��밡�� Employee ��ü �ּҰ��� ��ȯ
		System.out.println(e.toString());
		// println ���ο��� ���������� ������ toString()�� ȣ���ϹǷ� �Ʒ��� ���� ����� �� �ִ�.
		System.out.println(e);

		Employee2 e2 = new Employee2("1", "ȫ�浿");
		System.out.println(e2);
	}

}
