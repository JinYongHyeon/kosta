package step7;
//Daemon Thread 테스트 예제

/*
 * 스레드 클래스 두개정의
 * 1. Word
 * 2. BackupWorker
 * Word 스레드 시작시 BackupWorker thread 시작하도록 코드는 구성되어 있고 Word 스레드가 작업이 종료되어 해당 스레드가 종료되면 함께 BackupWorker thread도 종료되도록
 * setDaemon(true)를 설정한다.
 */

class BackupWorker implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("문서백업처리");
			try {
				Thread.sleep(3000); // 3초마다 백업처리
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void backup() {
		System.out.println("문서백업처리");
	}

}

/*
 * Word 스레드가 실행될떄 가장 먼저 BackupWorker Thread를 생성해 start 시킨다.
 */
class Word implements Runnable {

	@Override
	public void run() {
		Thread backupThread = new Thread(new BackupWorker());
		// Word thread가 종료되면 BackUpThread도 함꼐 종료된다
		backupThread.setDaemon(true);
		backupThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Work스레드동작");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		new BackupWorker().backup();
		System.out.println("***문서작업종료***");
	}

}

public class TestThread7 {

	public static void main(String[] args) {
		System.out.println("***main thread 시작***");
		Thread t = new Thread(new Word());
		t.start();
		System.out.println("***main thread 종료***");
	}

}
