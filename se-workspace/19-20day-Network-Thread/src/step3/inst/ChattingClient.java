package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 * ä�� Ŭ���̾�Ʈ
 * ChattingClient�� go()�޼���� ���ϻ����ϰ� ��ĳ�� , �� ��Ʈ�� ���� ģ������ �޼����� �Է¹޴� �����带 ���� start ��Ų��(���󽺷���)
 * ��ĳ�ʷκ��� �����͸� �Է¹޾� ������ ����ϴ� �۾� ���� ģ������ �޼����� �Է¹޾� �ֿܼ� ����ϴ� ���� ReceiverWorker Thread�� �����Ѵ�.
 */
public class ChattingClient {
	private Socket socket;
	private Scanner scanner;
	private PrintWriter pw;
	private BufferedReader br;

	public void go() throws UnknownHostException, IOException {
		try {
			scanner = new Scanner(System.in);
			socket = new Socket(IP.LOCAL, 5432);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			ReceiverWorker worker = new ReceiverWorker();
			Thread thared = new Thread(worker);
			thared.setDaemon(true); // �� ChattingClient�� ����Ǹ� ReceiverWorker Thread�� �Բ� ����
			thared.start();
			while (true) {
				String message = scanner.nextLine();
				if(message == null)break;
				pw.println(message);
				if (message == null || message.equals("null") || message.equals("����")) {
					System.out.println("ä��Ŭ���̾�Ʈ ����");
					break;
				}
			}
		} finally {
			closeAll();
		}
	}

	public void closeAll() throws IOException {
		if (scanner != null)
			scanner.close();
		if (socket != null)
			socket.close();
	}

	public static void main(String[] args) {
		try {
			new ChattingClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// inner class
	// �����κ��� ���� ģ������ �޼����� �Է¹޴� ������
	class ReceiverWorker implements Runnable {

		@Override
		public void run() {
			try {
				receive();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void receive() throws IOException {
			while (true) {
				String message = br.readLine();
				System.out.println(message);
			}

		}

	}

}
