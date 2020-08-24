package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.IP;

public class EchoClient {
	Socket socket = null;
	Scanner scanner = null;
	PrintWriter print = null;
	BufferedReader reader = null;

	public void go() throws IOException {

		try {
			scanner = new Scanner(System.in);
			socket = new Socket(IP.LOCAL, 5432);
			System.out.println(socket.getInetAddress());
			print = new PrintWriter(socket.getOutputStream(), true);
			EchoClientThread eet = new EchoClientThread();
			Thread t = new Thread(eet);
			t.setDaemon(true);
			t.start();
			while (true) {
				String message = scanner.nextLine();
				print.println(message);
				
				if (message.equals("����") || message == null) {
					System.out.println("***�ý����� �����մϴ�***");
					break;
				}
			}
		} finally {
			if (print != null)
				print.close();

			if (reader != null)
				reader.close();

			if (scanner != null)
				scanner.close();
			
			if (socket != null)
				socket.close();

		}

	}

	public static void main(String[] args) {

		try {
			new EchoClient().go();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class EchoClientThread implements Runnable {

		@Override
		public void run() {
			try {
				receive();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void receive() throws IOException {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String messag2 = reader.readLine();
				System.out.println("������ ���� �޼��� :" + messag2);
			}
		}
	}

}
