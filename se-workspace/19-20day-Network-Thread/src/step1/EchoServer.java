package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * 1 �� 1 ����, Ŭ���̾�Ʈ ���α׷�
 * ������ Ŭ���̾�Ʈ�� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����ϰ� (ip + �޼���) �� �޼����� �ٽ� Ŭ���̾�Ʈ�� ���(�޼���**server**)�ϴ� �۾��� ���������� �����Ѵ�.
 */
public class EchoServer {
	private ArrayList<EchoServerThread> list = new ArrayList<EchoServerThread>();

	public void go() {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(5432);
			System.out.println("***���� ����***");
			while (true) {
				Socket socket = ss.accept();
				EchoServerThread severInput = new EchoServerThread(socket);
				Thread inputThread = new Thread(severInput);
				inputThread.start();
			}
		} catch (IOException e) {
			System.out.println("��������");
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void broadcast(String message) {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).printWriter.println(message);

		}
	}

	public static void main(String[] args) {
		new EchoServer().go();
	}

	public class EchoServerThread implements Runnable {
		private Socket socket;
		BufferedReader serverReader;
		PrintWriter printWriter;

		public EchoServerThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				list.add(this);
				inputServer(socket);
			} catch (IOException e) {
				System.out.println("��������?");
			}
		}

		public void inputServer(Socket socket) throws IOException {

			try {
				serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				printWriter = new PrintWriter(socket.getOutputStream(), true);
				while (true) {
					String message = serverReader.readLine();
					System.out.println(message);
					broadcast(message);
					if (message.trim().equals("����") || message == null) {
						System.out.println(socket.getInetAddress() + "���� �������ϴ�.");
						break;
					}

				}
			} finally {
				if (socket != null)
					socket.close();
				
				if (serverReader != null)
					serverReader.close();
				
				if (printWriter != null)
					printWriter.close();
				
				list.remove(this);

			}
		}

	}

}
