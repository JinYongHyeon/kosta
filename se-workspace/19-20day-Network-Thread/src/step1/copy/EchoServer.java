package step1.copy;

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
			System.out.println("***���� ����***");
			System.out.println(list.size());
			try {
				while (true) {
					serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String message = serverReader.readLine();
					System.out.println(message);
					broadcast(message);
					if (message.trim().equals("����") || message == null) {
						System.out.println(socket.getInetAddress() + "���� �������ϴ�.");
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
