package step5;

public class TestRefArray2 {
	public static void main(String[] args) {
		// �迭 ���� ���� �Ҵ� ���ÿ�
		Person p[] = { new Person("�̼���", 33), new Person("ȫ�浿", 32), new Person("������", 34) };
		System.out.println(p.length);

		System.out.println("***�迭 ����� name�� age�� ���***");

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName() + " " + p[i].getAge());
		}

		System.out.println("������  FOR��");
		for (Person person : p) {
			System.out.println(person.getName() + " " + person.getAge());
		}
		
		System.out.println("***�迭 ��� ���̸� 20�� ���Ѵ�***");
		for (int i = 0; i < p.length; i++) {
			p[i].setAge(p[i].getAge()+20);
			System.out.println(p[i].getName() + " " + p[i].getAge());
		}
	}
}
