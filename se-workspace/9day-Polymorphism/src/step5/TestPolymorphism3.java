package step5;

class Car {

	public void logo() {
		System.out.println("�ڵ��� �ΰ�");
	}
}

class Kia extends Car {

	@Override
	public void logo() {
		System.out.println("���");
	}
}

class Hunday extends Car {
	@Override
	public void logo() {
		System.out.println("����");
	}
}

class Bmw extends Car {
	@Override
	public void logo() {
		System.out.println("BMW");
	}

}

class Dictionary {

	public void brand(Car c) {
		c.logo();
	}
}

public class TestPolymorphism3 {

	public static void main(String[] args) {
		Dictionary di = new Dictionary();

		di.brand(new Kia());
		di.brand(new Hunday());
		di.brand(new Bmw());

	}

}
