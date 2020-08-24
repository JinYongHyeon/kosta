package step2.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1 �� 1 ����, Ŭ���̾�Ʈ ���α׷�
 * ������ Ŭ���̾�Ʈ�� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ����ϰ� (ip + �޼���) �� �޼����� �ٽ� Ŭ���̾�Ʈ�� ���(�޼���**server**)�ϴ� �۾��� ���������� �����Ѵ�.
 */
public class EchoServer {

	public void go() throws IOException {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader reader = null;
		PrintWriter print = null;

		try {

			server = new ServerSocket(5431);
			System.out.println("**���� �۵���**");
			socket = server.accept();
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			print = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				String message = reader.readLine();
				if(message== null)
					break;
				System.out.println(socket.getInetAddress() + " : " + message);

				print.println(message);
				/*if (message.trim().equals("����")) {
					System.out.println("***�ý����� �����մϴ�.***");
					break;
				}*/
			}

		} finally {
			if (print != null)
				print.close();
			if (reader != null)
				reader.close();
			if (socket != null)
				socket.close();
			if (server != null)
				server.close();
		}

	}

	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			System.out.println("asd");
			e.printStackTrace();
		}
	}
}
