package step1;

public class Person {
/*
 *  Encapsulation ����Ŭ����
 *  �ܺο� �������� ���� �κ��� private 
 *  �ܺο� ���� �� �κ��� public
 */

	private String name;
	private int age;
	
	//getter �ܺο��� ������ ��ȯ�ޱ� ���� �޼���
	public String getName() {
		return name;
	}
		//setter�� �ܺο��� ������ �Ҵ�ޱ� ���� �޼���
	public void setName(String name) {
		//this�����(keyword)�� �ν��Ͻ� ������ ����Ű�� ���Ͽ� ����Ѵ�
		//this�� �̿��� �ν��Ͻ������� �Ű������� �����Ѵ�.
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	/*
	 * �Ű����� age�� ���޵� ���� 1 �̸��� ��� �߸��� �����̹Ƿ� �Ҵ��� �� �����ϴ�.
	 * 1�̻��̸� ��ü�� �ν��Ͻ� ���� age�� �Ҵ��Ѵ�.
	 */
	public void setAge(int age) {
		if(age>0) {
		this.age= age;
		}else {
			System.out.println("���̸� �ٽ� �Է����ֽʽÿ�.");
		}
	}

}
