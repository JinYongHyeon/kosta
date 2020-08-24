package step1;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		Car c1 = new Car();
		System.out.println(c);
		c.model = "BMW";
		System.out.println(c.model);
		c.model = "모닝";
		
		c1.model ="람보르기니";
		System.out.println(c.model);
		
		c.price = 100;
		System.out.println(c.price);
		
		c.drive();
		c1.drive();
		/*
		 *  c1 변수에 Car 객체를 생성한다. 생성한 객체의 Model 인스턴스 변수에 모닝을 할당한다. 할당한 model 정보를 출력해본다
		 */
	}

}
	