package step2;

public class TestException3 {
	/*
	 * Exception ���� �߻��� ������ �帧�� �˾ƺ��� ����
	 */
	public static void main(String[] args) {
		
		String age ="�����ѻ�"; // ������ ���� 
		try {
		int intAge =Integer.parseInt(age);	
		System.out.println(intAge+1);
		}catch(NumberFormatException e) {

			e.getMessage();
			e.printStackTrace();
			System.out.println("A");
		}catch(Exception b) {
			b.printStackTrace();
			System.out.println("B");
		}
		System.out.println("c");
	}

}
