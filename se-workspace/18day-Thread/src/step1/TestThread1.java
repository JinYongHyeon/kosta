package step1;

/*
 * ���� ������ ȯ�� �׽�Ʈ 
 */
class Worker extends Thread{
	public void work() {
		for(int i =0; i<5 ; i++)
		System.out.println("Worker ���ϴ�"+i);
	}
}

public class TestThread1 {

	public static void main(String[] args) {
		System.out.println("***main Thread ����***");
		Worker w = new Worker();
		w.work();
		System.out.println("***main Thread ����***");
	}

}
