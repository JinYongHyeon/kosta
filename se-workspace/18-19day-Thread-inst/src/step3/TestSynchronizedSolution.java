package step3;

/*
 * synchronized �ʿ伺�� Ȯ���ϴ� ����
 * �ϳ��� �ڿ��� �ټ��� �����尡 ����Ǿ� �ڿ��� �����ϴ� ��� �߻��� �� �ִ� �������� Ȯ���ϴ� ���� - �����ڿ�(Toilet�� seat)�� �����ϴ� ������ 
 * synchronized ó���ϸ� �ȴ�. 
 * 
 * synchronized ó���� �ش� ������ ������ ó���� �ϵ��� ����ϴ� ���� ���Ѵ�. 
 * ������ óġ�� �� ������ ���� ������ ȯ������ ���� ��Ų�ٴ� ���� �ǹ��Ѵ�.
 */

class Toilet implements Runnable {
	// �� �������� �����ڿ�
	private boolean seat; // �ν��Ͻ� ������ �⺻ �ʱ�ȭ false �Ҵ�

	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void use(String user) throws InterruptedException {
		//if (seat == false) {
			//Thread.sleep(1000);
			//seat = true;
			System.out.println(user + " ����");
			System.out.println(user + " ���");
			//Thread.sleep(3000);
			System.out.println(user + " ����");
			//seat = false;
		//} else { // seat�� true�̸� ȭ����� ����ϴ� �����̹Ƿ� ����Ұ�
		//	System.out.println(user + "�� ȭ��� ������̹Ƿ� ����Ұ�");
	//	}
	}
}

class a implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�̰� ȣ��ǳ�?");
		}
	}
}

public class TestSynchronizedSolution {

	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		a a1 = new a();
		Thread t1 = new Thread(toilet, "ȫ�浿������");
		Thread t2 = new Thread(toilet, "�տ���������");

		t1.start();
		t2.start();

	}

}
