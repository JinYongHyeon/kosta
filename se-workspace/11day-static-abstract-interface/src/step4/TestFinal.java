package step4;

class Person{
	/*
	 * final(���) �����ڸ� ����ϸ� ���Ҵ� �Ұ�
	 * �ڹٿ��� ����� �빮�ڷ� ǥ���Ѵ�.
	 */
	final int MAX_PRICE =100;
	public void test1() {
		//MAX_PRICE =200; final�̹Ƿ� ���Ҵ�Ұ�
	}
}

final class Parent{
	public Parent() {System.out.println("asd");}
}

//final class�� ��ӹ��� �� ����.
//class Child extends Parent{}

class Animal{
	public final void eat() {}
}

class Dog extends Animal{
	/* �θ��� final �޼���� �������̵� �� �� ����.
	@Override
	public void eat() {}
	*/
}

public class TestFinal {
	
	public static void main(String[] args) {
		new Parent();
	}

}
