package step4;
/*
 * ��Ƽ ������ �׽�Ʈ(������ �÷��̾� ���μ��� ����)
 * 1.���� �۾� ������
 * 2.���� �۾� ������
 */

class VideoWorker implements Runnable {

	@Override
	public void run() {
		try {
			work();
		} catch (InterruptedException e) {
		}
	}

	private void work() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("�����۾� Thread" + i);
			Thread.sleep(1000); // 1�ʰ� ������ �۾� �Ͻ� �ߴ� �� �簳

		}
	}

}

class AudioWorker implements Runnable{

	@Override
	public void run() {
		try {
		work();
		}catch(InterruptedException e) {
			
		}
	}

	private void work() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("������۾� Thread"+i);
			Thread.sleep(1000);
		}
	}
	
}

public class TestThread4 {

	public static void main(String[] args) {
		System.out.println("***main thread ����***");
		new Thread(new VideoWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("***main thread ����***");
	}

}
