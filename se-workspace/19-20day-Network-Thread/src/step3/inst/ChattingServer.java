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

/* client�� ����ϴ� ��ü�� ����Ʈ�� ����
 * private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
 * public void go(){
 *  accept() -> ServerWorker(socket) -> list�� �߰� -> Thread -> start
 * }
 * main()
 * ������ ��� Ŭ���̾�Ʈ���� �޼����� ����ϴ� �޼���
 * public void broadcast(String message){}
 * class ServerWorker implements Runnable(){
 * 	socket
 * ServerWorker(socket)
 *  run(){} -> finally���� list�� list.remove(this); �ڱ��ڽ�
 *  chatting(){} 
 * } Ŭ���̾�Ʈ �޼����� �Է¹޾� ������ ��� Ŭ���̾�Ʈ���� �޼����� ������.
 */
public class ChattingServer {

	// ������ Ŭ���̾�Ʈ�� ����� ServerWorker ��ü���� ����� ����Ʈ

	/*
	 * �ټ��� ������(ServerWorker Thread)�� ���� �����Ǵ� �ڿ��̹Ƿ� ����ȭó���� �ʿ�(list ��ҿ� ���� �߰� �� ���� �۾�
	 * �����̹Ƿ�) Collection.synchronizedList(new ArrayList<ServerWarker>()); ->
	 * thread-safe�� ����Ʈ�� ��ȯ���� �� �ִ�.
	 */
	// private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	private List<ServerWorker> list = Collections.synchronizedList(new ArrayList<ServerWorker>());

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("***ä�� ����***");
			while (true) {
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				list.add(serverWorker);
				System.out.println(socket.getInetAddress() + "�� �����ϼ̽��ϴ�.");
				Thread t = new Thread(serverWorker);
				t.start();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	// ������ ��� Ŭ���̾�Ʈ���� �޼����� ���
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
			broadcast(clientIp + "�����ϼ̽��ϴ�.");
			while (true) {
				String message = br.readLine();
				if (message == null || message.equals("null") || message.equals("����")) {
					break;
				}
				System.out.println(message);
				broadcast(clientIp + "���� �޼��� : " + message);
			}
		}

		@Override
		public void run() {
			try {
				chatting();
				broadcast(clientIp + "�������ϴ�.");
			} catch (IOException e) {
				System.out.println(clientIp + "�� ���� ���������Ͽ� ����");
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
				// System.out.println(clientIp+"�������ϴ�.");

			}
		}// run

	}// inner class

}// class
