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
 * 채팅 클라이언트
 * ChattingClient의 go()메서드는 소켓생성하고 스캐너 , 각 스트림 생성 친구들의 메세지를 입력받는 스레드를 생성 start 시킨다(데몬스레드)
 * 스캐너로부터 데이터를 입력받아 서버에 출력하는 작업 지속 친구들의 메세지를 입력받아 콘솔에 출력하는 역할 ReceiverWorker Thread가 전담한다.
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
			thared.setDaemon(true); // 현 ChattingClient가 종료되면 ReceiverWorker Thread도 함꼐 종료
			thared.start();
			while (true) {
				String message = scanner.nextLine();
				if(message == null)break;
				pw.println(message);
				if (message == null || message.equals("null") || message.equals("종료")) {
					System.out.println("채팅클라이언트 종료");
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
	// 서버로부터 오는 친구들의 메세지를 입력받는 스레드
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
