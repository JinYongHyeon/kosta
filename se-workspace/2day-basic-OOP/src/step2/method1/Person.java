package step2.method1;

public class Person {
	
	public void eat() {
		System.out.println("�Դ�");
	}
	
	//�޼��带 ȣ���� �����κ��� �����͸� ���޹ޱ� ���� �Ű������� ������ �޼��带�� �ۼ��� ����.
	public void eat2(String menu) {
		System.out.println(menu+"�Դ�");
	}
	
	public void eat3(String menu,int count) {
		System.out.println(menu+" "+count+"�� �Դ�");
	}
	
	public String eat4(String menu) {
		return menu+"~ ����";
	}
}
