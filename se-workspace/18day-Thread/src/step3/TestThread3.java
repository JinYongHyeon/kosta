package step3;
/*
 * 채팅 클라이언트 프로그램을 연상하면서 두개의 스레드를 생성시켜 실행해본다.
 * 1.InputWorker Thread : 친구들의 메세지를 입력받는 일을 하는 스레드
 * 2.main Thread : 친구들에게 메세지를 출력하는 일을 하는 스레드 
 */

class InputWokrer implements Runnable {
	// InputWorker Thread의 작업 내용을 정의, JVM이 스케줄링을 하면 이 메서드가 자동 호출된다.
	@Override
	public void run() {
		inputMessage();
	}

	public void inputMessage() {
		for (int i = 0; i < 10; i++) {
			System.out.println("친구들 메세지 입력받는 Input Thread");
		}
	}
}

public class TestThread3 {
	public void outputMessage() {
		for(int i=0;i<5;i++) {
			System.out.println("친구들에게 메세지를 출력하는 일을 하는 Output main Thread");
		}
	}
	public static void main(String[] args) {
		System.out.println("***main thread 시작***");
		Thread t = new Thread(new InputWokrer());
		t.start();
		new TestThread3().outputMessage();
		System.out.println("***main thread 종료***");
	}

}
