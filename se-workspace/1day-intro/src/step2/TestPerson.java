package step2;

public class TestPerson {

	public static void main(String[] args) {
		
		//Person class�� �̿���  Person ��ü�� �����Ѵ�.
		Person ps = new Person();
		//Person class�� name ������ �̸��� �����Ѵ�.
		ps.name = "ȫ�浿";
		//ps ��ü�� name�� ����Ѵ�.
		System.out.println(ps.name);
		//ps ��ü�� eat() �޼ҵ�[�Լ�]�� �����غ���
		ps.eat();	
	}

}
