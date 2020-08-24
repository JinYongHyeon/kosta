package step1.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * 1 대 1 서버, 클라이언트 프로그램
 * 서버는 클라이언트의 메세지를 입력받아 자신으 콘솔에 출력하고 (ip + 메세지) 그 메세지를 다시 클라이언트로 출력(메세지**server**)하는 작업을 지속적으로 수행한다.
 */
public class EchoServer {
	private ArrayList<EchoServer.EchoServerThread> list = new ArrayList<EchoServer.EchoServerThread>();
	public void go() {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(5432);

			while (true) {
				Socket socket = ss.accept();
				// EchoServerThread severInput = new EchoServerThread(socket);
				EchoServer.EchoServerThread severInput = new EchoServer().new EchoServerThread(socket);
				Thread inputThread = new Thread(severInput);
				inputThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void broadcast(String message) {
		for(int i=0;i<list.size();i++) {
			try {
				PrintWriter printWriter = new PrintWriter(list.get(i).socket.getOutputStream(),true);
				printWriter.println(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		new EchoServer().go();
	}

	public class EchoServerThread implements Runnable {
		private Socket socket;
	
		public EchoServerThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				inputServer(socket);
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				list.remove(this);
			}
		}

		public void inputServer(Socket socket) throws IOException {
			list.add(this);
			BufferedReader serverReader = null;
			System.out.println("***서버 오픈***");
			System.out.println(list.size());
			try {
				while (true) {
					serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String message = serverReader.readLine();
					System.out.println(message);
					broadcast(message);
					if (message.trim().equals("종료") || message == null) {
						System.out.println(socket.getInetAddress() + "님이 나갔습니다.");
						break;
					}
					
				}
			} finally {
				if (serverReader != null)
					serverReader.close();
				if (socket != null)
					socket.close();
			}
		}

	}

}
