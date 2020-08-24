package step5;

class Animal {
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal {
	/*
	 * �޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������
	 */
	@Override
	public void eat() {
		System.out.println("����� ���̽�ũ���� �Դ�.");
	}
}

class Monkey extends Animal {
	@Override
	public void eat() {
		System.out.println("�����̰� �ٳ����� �Դ�.");
	}

}



public class TestPolymorphism1 {

	public static void main(String[] args) {

		// new Person()���� ��ü �����ϰ� ��ȯ�Ǵ� �ּҰ��� Animal Ÿ���� a ������ �����Ѵ�.
		// �θ� Ÿ���� ������ �ڽ� ��ü�� ������ų �� �ִ�.
		Animal a = new Person(); // UpCasting
		a.eat();// �ڽ��� �������̵� �� �޼��尡 ����ȴ�.

		Animal a2 = new Monkey();
		a2.eat();
		// Car�� Animal�� �ڽ��� �ƴϹǷ� complie error
		// Animal a3 = new Car();

	}

}
