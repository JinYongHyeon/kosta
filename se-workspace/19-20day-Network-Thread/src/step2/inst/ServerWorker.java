package step2.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 개별 클라이언트와 메세지를 받고 줄 객체
 */
public class ServerWorker implements Runnable {
	private Socket socket;

	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}

	/*
	 * 접속한 클라이언트와 지속적으로 통신 입력받아 다시 출력하고 종료메세지가 오면 close 작업 수행 후 run() 메서드 종료 -> 스레드
	 * 종료
	 */
	public void echo() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		String user = socket.getInetAddress().toString();

		while (true) { // 입력 출력을 반복한다.
			try {
				String message = br.readLine();
				if (message == null || message.contentEquals("null") || message.trim().equals("종료")) {
					System.out.println(user + "님이 나가셨습니다.");
					break;
				}
				System.out.println(user + "님 메세지 : " + message);
				pw.println(message);
			} catch (Exception e) {
				System.out.println(user + "님이 나가셨습니다.");
				break;
			}
		}
	}

	@Override
	public void run() {

		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
