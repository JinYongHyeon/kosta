package test;
/*
 * 상속을 안받고 외부 다른 클래스가 객체를 생성을 해서 쓸떄 없는 남용 방지  필요한 메소드 강조해주고 
 * */
class Car{
	
	public void move() {System.out.println("부릉");}
}

class Kia extends Car{
	
	@Override
	public void move() {
		System.out.println("기아 부릉");
	}
}

class Bmw extends Car{
	@Override
	public void move() {
		System.out.println("bmw 부릉");
	}
}

class Co extends Car{
	@Override
	public void move() {
		System.out.println("co 부릉");
	}
}

class Tiger{
	Car c = new Car();
	
	public void sound() {
		c.move();
	}
}

public class TestCar {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.sound();
	}

}
