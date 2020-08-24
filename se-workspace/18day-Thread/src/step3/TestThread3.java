package step3;
/*
 * ä�� Ŭ���̾�Ʈ ���α׷��� �����ϸ鼭 �ΰ��� �����带 �������� �����غ���.
 * 1.InputWorker Thread : ģ������ �޼����� �Է¹޴� ���� �ϴ� ������
 * 2.main Thread : ģ���鿡�� �޼����� ����ϴ� ���� �ϴ� ������ 
 */

class InputWokrer implements Runnable {
	// InputWorker Thread�� �۾� ������ ����, JVM�� �����ٸ��� �ϸ� �� �޼��尡 �ڵ� ȣ��ȴ�.
	@Override
	public void run() {
		inputMessage();
	}

	public void inputMessage() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ģ���� �޼��� �Է¹޴� Input Thread");
		}
	}
}

public class TestThread3 {
	public void outputMessage() {
		for(int i=0;i<5;i++) {
			System.out.println("ģ���鿡�� �޼����� ����ϴ� ���� �ϴ� Output main Thread");
		}
	}
	public static void main(String[] args) {
		System.out.println("***main thread ����***");
		Thread t = new Thread(new InputWokrer());
		t.start();
		new TestThread3().outputMessage();
		System.out.println("***main thread ����***");
	}

}
