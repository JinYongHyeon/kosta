package step1;
interface Flyer2{
	
}
interface Flyer { //���� �������̽�
	//������ ������ ��� public static final�� �ȴ�
	String ID="javaking";
	
	// public abstract void fly();
	public void fly(); // abstract�� ������ ������� �ʾƵ� ��.
	
	public default void fly2() {System.out.println("������");}
}	

class Animal {

}

class Person extends Animal {

}

class Bird extends Animal implements Flyer { //���� ����ü
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");

	}
}
	class Airplane implements Flyer {

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("����Ⱑ ����");
			
		}
	}

public class TestInterface1 {

	public static void main(String[] args) {
		//�������̽� ������ Ȯ���ϴ� ����
		//Animal a = new Airplance(); error, ���� Ÿ�Ը� ����
		
		//���� �������̽� Ÿ������ ���� ��ü�� ������ ���ֵ� �������� �����
		Flyer f1 = new Bird();
		Flyer f2 = new Airplane();
		
		f1.fly();
		f1.fly2();
		f2.fly();
		
	}

}
