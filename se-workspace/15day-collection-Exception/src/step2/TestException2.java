package step2;

import java.util.ArrayList;

public class TestException2 {
		
	public void a() throws NullPointerException {
		System.out.println("aȣ��");
		String name =null;
		System.out.println(name.length());
	}
	
	public void b() {
		try {
		a();
		System.out.println("bȣ��");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("�� ȣ���?");
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * ����۾�����(Ʈ�����)
		 * try{
		 * 1. ī�� ����
		 * 2. �۾�����
		 * 3. �ݾ��Է�
		 * 4. ���
		 * }catch(ī�� ����){
		 * }catch(�ݾ׿���){
		 * }
		 */
		
		//�ϳ��� try�� �ȿ� �پ��� ���ܰ� �߻����� �����Ƿ� �������� catch ������ �����ϴ�
		ArrayList<String> list = new ArrayList<String>();
		String name="ȫ�浿";
		name = null;
		try {
			System.out.println(list.get(1));
			System.out.println();
			System.out.println(name.length());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("�̸��� �������� �ʽ��ϴ�.");
		}catch(Exception e2){
			e2.printStackTrace();
			System.out.println("�� ���� ���̰� ���ư���");
		}
		System.out.println("���α׷� ���� ����");
		
		System.out.println("***********************");
		new TestException2().b();
	}

}
