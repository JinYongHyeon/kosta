package step4;

public class TestOverridingEx {

	public static void main(String[] args) {
		Employee e= new Employee("18","ȫ�浿",900);
		System.out.println("Employee "+e);
		//Employee[empNo= 18, nmae= ȫ�浿,salary= 900]
		Enginner en = new Enginner("18","ȫ�浿",900,"java");
		System.out.println("Enginner "+en);
		
		Manager m = new Manager("18","ȫ�浿",900,"����");
		System.out.println("Manager "+m);
	}

}
