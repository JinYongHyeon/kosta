package step7;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal{
	//�޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������
	@Override
	public void eat() {
		System.out.println("�����θԴ�");
		super.eat();
	}
}

class Dog extends Animal{
	
}
public class TestOverriding {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		Dog d= new Dog();
		d.eat();
	}

}
