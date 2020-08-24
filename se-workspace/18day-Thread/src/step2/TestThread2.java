package step2;
/*
step1 단일스레드 예제와 실행결과를 비교해 본다.
step2 TestThread2는  main WorkerThread즉 두개의 스레드가 동작되는 예제
스레드를 만드는 첫번째 방법은 extends Thread이다.
*/

class Worker extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Worker 일하다" + i);
	}
}



public class TestThread2 {
	/*
	 * main Thread가 먼저 실행 후 Worker Thread 실행 단일 Thread???
	 */
	public static void main(String[] args) {
		System.out.println("***main Thread 시작***");
		// Worker Thread 생성 -> run() 메서드 실행시키는 것이 아니고 start() 라는 Thread 클래스의 메서드를 실행해야
		// 한다.
		Worker w = new Worker();
				
		w.start();//스레드를 실행시키는 것이 아니라 실행가능상태로 보낸다
		
		System.out.println("***main Thread 종료**");
	}
}
