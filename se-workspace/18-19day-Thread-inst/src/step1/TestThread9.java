package step1;

/*
 * 자바 멀티 스레드는 데이터를 공유할 수 있는 장점을 가진다.
 */

class Worker implements Runnable {

	private String info = "공유자원";

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(name+" : "+info+" 사용해 작업수행");
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
		System.out.println("***main thread 시작***");
	//	for(int i=0;i<10;i++) {
			new Thread(w,"첫번째 스레드").start();
			new Thread(w,"두번째 스레드").start();
			new Thread(w,"세번째 스레드").start();
	//	}
		System.out.println("***main thread 종료***");
	}

}
