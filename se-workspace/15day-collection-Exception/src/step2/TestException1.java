package step2;

public class TestException1 {
	
	
	public static void main(String[] args) {

		/*Exception �߻��ϸ� ���α׷��� ���� �ߴ��Ѵ�.
		 * Exception �߻��ϸ� ���α׷��� ���� �ߴ��Ѵ�.
		 * Exception �߻��ϸ� JVM�� ���� ���� ���� �� ����������
		 * Exception �ֿ� Ű������ try catch�� �̿��� ���� ó���� �ϰ� ���α׷��� ��������ϵ��� �غ���.
		 */
		String name="ȫ�浿";
		name = null;
		try {
			System.out.println(name.length());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("�̸��� �������� �ʽ��ϴ�.");
		}
		System.out.println("���α׷� ���� ����");
	}

}
