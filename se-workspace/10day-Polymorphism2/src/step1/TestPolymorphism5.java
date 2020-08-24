package step1;

class Animal {
	public void sleep() {
		System.out.println("�ڴ�");
	}

	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal {
	//�޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������
	@Override
	public void eat() {
		System.out.println("����� ������ �Դ�.");
	}
	//�ڽ��� �������� �޼���
	public void study() {
		System.out.println("����� �����ϴ�.");
	}

}

public class TestPolymorphism5 {

	public static void main(String[] args) {
		//�θ�Ÿ���� ������ �ڽ� ��ü�� ���� ��ų �� �ִ�.
		Animal a = new Person();
		//�� ��� �ٷ� �����Ͽ� ��밡���� ���� �θ�κ��� ��ӹ��� ���(����,�޼���)�� �������̵��� �޼����̴�.
		a.eat();//�������̵��Ѱ�
		a.sleep();//��ӹ�����
		/*
		 * �ڽ��� �������� ����� �����ϱ� ���ؼ� Object down casting�� �ʿ��ϴ�
		 */
		Person p = (Person) a;
		p.study();
	}

}
