package step2.method1;

public class TestPerson {

	public static void main(String[] args) {
		//Person class�� �̿��� ��ü�� �����Ѵ� p
		Person p = new Person();
		
		//p ��ü�� eat() �޼��带 ȣ���ؼ� �����Ų��.
		p.eat();
		p.eat2("����");
		p.eat2("���ɸ�");
		p.eat3("������ũ",4);
		
		String name = p.eat4("�δ����");
		System.out.println(name);
		
	
		
		
	}

}
