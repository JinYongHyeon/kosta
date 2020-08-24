package step6;

public class TestInheritance3 {

	public static void main(String[] args) {
		Employee e = new Employee("20", "진용현", 1000);
 		System.out.println(e.getEmpNo() + e.getName() + e.getSalary());
		Engineer en = new Engineer("19", "강희석", 1200, "java");
		System.out.println(en.getEmpNo() + en.getName() + en.getSalary() + en.getSkill());

	}

}
