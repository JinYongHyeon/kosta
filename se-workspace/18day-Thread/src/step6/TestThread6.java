package step6;

/*
 * �ڹ� ������ �����ٸ��� �켱 ���� ����� ä�� �̸� Ȯ���ϴ� ���� 
 * �׽�Ʈ ������ 20�� ������ start��Ű�� �� �� �ϳ��� �켱������ ���� ���� ������ ���� ����� Ȯ�� . 
 */
class Worker implements Runnable {

	@Override
	public void run() {
		// ���� �������� ������ �̸��� ��ȯ�޴´�.
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		for (long i = 0; i < 900000000; i++) {
			//System.out.println(name);
		}
		System.out.println(name+"������ ����Ϸ�! �켱���� : "+priority);
	}

}

public class TestThread6 {

	public static void main(String[] args) {
		Worker w = new Worker();
		/*Thread t1 = new Thread(w,"1���� �ϲ� ������");
		t1.setPriority(9);
		t1.start();*/
		//20���� �����带 �����ϰ� start�ϵ� 9��° ������� �켱������ 10���� �Ҵ��Ѵ�.
		for(int i=1;i<=20;i++) {
			Thread t = new Thread(w,i+"���� �ϲ� ������");
			if(i == 9)t.setPriority(9);
			t.start();
		}
		System.out.println("***main thread ����***");
		System.out.println("***main thread ����***");
	}

}
