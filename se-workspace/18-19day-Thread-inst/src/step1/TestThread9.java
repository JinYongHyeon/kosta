package step1;

/*
 * �ڹ� ��Ƽ ������� �����͸� ������ �� �ִ� ������ ������.
 */

class Worker implements Runnable {

	private String info = "�����ڿ�";

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(name+" : "+info+" ����� �۾�����");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}
	}

}

public class TestThread9 {

	public static void main(String[] args) {
		Worker w = new Worker();
		System.out.println("***main thread ����***");
	//	for(int i=0;i<10;i++) {
			new Thread(w,"ù��° ������").start();
			new Thread(w,"�ι�° ������").start();
			new Thread(w,"����° ������").start();
	//	}
		System.out.println("***main thread ����***");
	}

}