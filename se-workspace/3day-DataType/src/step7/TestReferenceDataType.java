package step7;

public class TestReferenceDataType {

	public static void main(String[] args) {
		/*
		 * Person : ������ ������ Ÿ��
		 * p : �������� reference variable (��ü�� �����ϴ� �ּҰ��� ����)
		 * 
		 */
		Person p = new Person("ȫ�浿");
		System.out.println(p.getName());
		
		Person p2 = new Person("�տ���");
		System.out.println(p2.getName());
		p=p2;
		System.out.println(p.getName());
		System.out.println(p2.getName());
		

	}
}
