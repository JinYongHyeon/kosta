//��Ű���� �ǹ��ִ� ���丮���� Ŭ������ �з��ϱ� ���� ���
package step1;
//Ŭ������ �Ϲ������� ��ü ������ ���� Ʋ�� ���� �����Ѵ�.
public class Person {
//�ν��Ͻ� ����(Instance Variable) : ��ü�� �Ӽ� ������ ����, �ڹ� �޸� ���� �� Heap ����(���� �޸� ����)�� ����
//�ν��Ͻ� ������ ���� �ص� �ڵ� �⺻ �ʱ�ȭ�ȴ�
	
	private String name; // �ʱ� �� String null
	
	public void eat() {
		int count =2; //Local Variable(���� ����) : �޼��� ���� ����, �޼��� ����ÿ� �Ͻ������� ���� �� �޸𸮿��� ����
		System.out.println(count+"�κ� �Դ�");
	}

	public String getName() {
		return name;
	}
//�Ʒ��� name�� ������������ �Ű�����(parameter)�� �Ҹ�
	public void setName(String name) {
//this.name : this�� ���� ��ü�� ����Ű�Ƿ� �ν��Ͻ� ���� name ��ħ
//name : ������������ �Ű������� ����Ų��.
		this.name = name;
	}
	
	public void sleep() {
		/*�������� time�� �ʱ�ȭ �Ǿ� ���� �����Ƿ� compile error
		int time;
		System.out.println(time);
		*/
		int time2=0;//�̿� ���� �����  �ʱ�ȭ�� �ʿ��ϴ�
		System.out.println(time2);
	}
	
	public void testVariable() {
		//�ν��Ͻ� ���� name�� �����ؼ� ���
		System.out.println(name);
		/*sleep()�޼��� ���������� time2�� �����غ���
		 * System.out.print(time2) ���ú����� �ӽ÷� ����ϹǷ� �ٸ� �޼��忡���� ���Ұ� compile error 
		 */
		sleep(); //�� �޼��忡�� �ٸ� �޼��� ȣ���� ����
	}
	

}
