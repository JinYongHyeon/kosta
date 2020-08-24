package step5;

//abstract method�� �ϳ� �̻� �����ϸ� �� Ŭ������ abstract�� ����Ǿ�� �Ѵ�.
abstract class Parent {

	public Parent() {
		System.out.println("Parent ������");
	}

	public void eat() {
		System.out.println("�Դ�");
	}

	// abstract �޼���� �����θ�{} ���� �� ����. ���� ���� ����
	public abstract void study();

}

class Child extends Parent {

	@Override
	public void study() {
		System.out.println("Child �����ϴ�");
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		// Parent p2 = new Parent(); abstract class�̹Ƿ� ���� ��ü ������ �� ����.
		Child p = new Child();
		p.study();
		p.eat();
	}

}
