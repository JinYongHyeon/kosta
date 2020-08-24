package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* client와 통신하는 객체를 리스트에 저장
 * private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
 * public void go(){
 *  accept() -> ServerWorker(socket) -> list에 추가 -> Thread -> start
 * }
 * main()
 * 접속한 모든 클라이언트에게 메세지를 출력하는 메서드
 * public void broadcast(String message){}
 * class ServerWorker implements Runnable(){
 * 	socket
 * ServerWorker(socket)
 *  run(){} -> finally에서 list에 list.remove(this); 자기자신
 *  chatting(){} 
 * } 클라이언트 메세지를 입력받아 접속한 모든 클라이언트에게 메세지를 보낸다.
 */
public class ChattingServer {

	// 접속한 클라이언트와 통신할 ServerWorker 객체들이 저장된 리스트

	/*
	 * 다수의 스레드(ServerWorker Thread)에 의해 공유되는 자원이므로 동기화처리가 필요(list 요소에 대한 추가 및 삭제 작업
	 * 진행이므로) Collection.synchronizedList(new ArrayList<ServerWarker>()); ->
	 * thread-safe한 리스트를 반환받을 수 있다.
	 */
	// private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	private List<ServerWorker> list = Collections.synchronizedList(new ArrayList<ServerWorker>());

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("***채팅 서버***");
			while (true) {
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				list.add(serverWorker);
				System.out.println(socket.getInetAddress() + "님 입장하셨습니다.");
				Thread t = new Thread(serverWorker);
				t.start();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	// 접속한 모든 클라이언트에게 메세지를 출력
	public void broadcast(String message) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).pw.println(message);
		}
	}

	public static void main(String[] args) {
		try {
			new ChattingServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// inner class
	class ServerWorker implements Runnable {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;
		private String clientIp;

		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
			clientIp = socket.getInetAddress().toString();
		}

		public void chatting() throws IOException {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			broadcast(clientIp + "입장하셨습니다.");
			while (true) {
				String message = br.readLine();
				if (message == null || message.equals("null") || message.equals("종료")) {
					break;
				}
				System.out.println(message);
				broadcast(clientIp + "님의 메세지 : " + message);
			}
		}

		@Override
		public void run() {
			try {
				chatting();
				broadcast(clientIp + "나갔습니다.");
			} catch (IOException e) {
				System.out.println(clientIp + "이 분이 강제종료하여 나감");
			} finally {
				try {
					if (br != null)
						br.close();
					if (pw != null)
						pw.close();
					if (socket != null)
						socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				list.remove(this);
				// System.out.println(clientIp+"나갔습니다.");

			}
		}// run

	}// inner class

}// class
