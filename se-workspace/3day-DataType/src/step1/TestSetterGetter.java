package step1;

/*
 * Encapsulation ����� Ŭ������ �׽�Ʈ �ϴ� ����
 * setter/getter�� Ȱ���غ���
 */

public class TestSetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();

		p.setName("��ŷ");
		System.out.println(p.getName());

		System.out.println("******************************************");

		p.setAge(-28);	
		p.setAge(28);
		System.out.println(p.getAge() + "��");

	}

}
