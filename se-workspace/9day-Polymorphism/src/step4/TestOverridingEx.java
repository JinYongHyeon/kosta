package step4;

public class TestOverridingEx {

	public static void main(String[] args) {
		Employee e= new Employee("18","È«±æµ¿",900);
		System.out.println("Employee "+e);
		//Employee[empNo= 18, nmae= È«±æµ¿,salary= 900]
		Enginner en = new Enginner("18","È«±æµ¿",900,"java");
		System.out.println("Enginner "+en);
		
		Manager m = new Manager("18","È«±æµ¿",900,"°³¹ß");
		System.out.println("Manager "+m);
	}

}
