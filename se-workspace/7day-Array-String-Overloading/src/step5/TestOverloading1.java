package step5;

class Person {
	public void eat() {
		System.out.println("�Դ�");
	}

	/*
	 * �����ε�(�޼���) : ������ �̸��� �޼���� �Ű������� �ٸ��� �ϴ� ���-> ����� ���Ǽ�
	 */
	public void eat(String name) {
		System.out.println(name + "�Դ�.");
	}

	/*
	 * �޼��� �����ε� : �Ű������� ����, Ÿ��, ������ �ٸ��� �����ε����� �ν��Ѵ�.
	 */
	public void eat(int count) {
		System.out.println(count + "�� �Դ�");
	}

	public void eat(int count, String name) {
		System.out.println(name + "��" + count + "��" + "�Դ�");
	}
}

public class TestOverloading1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.eat("������ũ");
		p.eat(15);
		p.eat(15,"������ũ");
		
		
	}
}
