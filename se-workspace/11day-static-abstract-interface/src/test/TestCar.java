package test;
/*
 * ����� �ȹް� �ܺ� �ٸ� Ŭ������ ��ü�� ������ �ؼ� ���� ���� ���� ����  �ʿ��� �޼ҵ� �������ְ� 
 * */
class Car{
	
	public void move() {System.out.println("�θ�");}
}

class Kia extends Car{
	
	@Override
	public void move() {
		System.out.println("��� �θ�");
	}
}

class Bmw extends Car{
	@Override
	public void move() {
		System.out.println("bmw �θ�");
	}
}

class Co extends Car{
	@Override
	public void move() {
		System.out.println("co �θ�");
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
