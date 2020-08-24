package step7;
//Daemon Thread �׽�Ʈ ����

/*
 * ������ Ŭ���� �ΰ�����
 * 1. Word
 * 2. BackupWorker
 * Word ������ ���۽� BackupWorker thread �����ϵ��� �ڵ�� �����Ǿ� �ְ� Word �����尡 �۾��� ����Ǿ� �ش� �����尡 ����Ǹ� �Բ� BackupWorker thread�� ����ǵ���
 * setDaemon(true)�� �����Ѵ�.
 */

class BackupWorker implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("�������ó��");
			try {
				Thread.sleep(3000); // 3�ʸ��� ���ó��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void backup() {
		System.out.println("�������ó��");
	}

}

/*
 * Word �����尡 ����ɋ� ���� ���� BackupWorker Thread�� ������ start ��Ų��.
 */
class Word implements Runnable {

	@Override
	public void run() {
		Thread backupThread = new Thread(new BackupWorker());
		// Word thread�� ����Ǹ� BackUpThread�� �Բ� ����ȴ�
		backupThread.setDaemon(true);
		backupThread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Work�����嵿��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		new BackupWorker().backup();
		System.out.println("***�����۾�����***");
	}

}

public class TestThread7 {

	public static void main(String[] args) {
		System.out.println("***main thread ����***");
		Thread t = new Thread(new Word());
		t.start();
		System.out.println("***main thread ����***");
	}

}
