package step8;

class Animal {
	public void eat() {
		System.out.println("�Դ�.");
	}

	public void sleep() {
		System.out.println("�ڴ�");
	}
}

class Person extends Animal {
	public void study() {
		System.out.println("�����ϴ�.");
	}

	@Override
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}

}

public class TestPolymorphism5 {

	public static void main(String[] args) {
		/*
		 * ������ ����� Ư¡ �Ʒ��� ���� �θ� Ÿ���� ������ �ڽ� ��ü�� ������ ���
		 */
		Animal a = new Person();
		a.sleep(); // ��ӹ��� �θ� �޼��忡 ������ ��밡��
		a.eat(); // �������̵��� �޼��� ��밡���ϴ�.
		//a.study(); �ڽ� Person�� ������ ���(study �޼���)���� ���� �Ұ� -> a�� Ÿ���� Animal �θ��̹Ƿ� �ȵ�. complie error

		//�����ϱ� ���ؼ��� Object down casting ������ �ʿ��ϴ�
		((Person)a).study();
		/*  �Ʒ��͵� ����(���������� �� ��)
		 * 	Person p = (Person) a;
		 *	p.study();
		 */

	}

}
