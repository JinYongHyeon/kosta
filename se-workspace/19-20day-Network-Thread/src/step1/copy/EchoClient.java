package step1.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.IP;

public class EchoClient {
	public void go() throws IOException {
		Socket socket = null;
		Scanner scanner = null;
		PrintWriter print = null;
		BufferedReader reader = null;
		try {
			scanner = new Scanner(System.in);
			socket = new Socket(IP.LOCAL, 5432);
			print = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				
				String message = scanner.nextLine();
				System.out.println("������ ���� �޼��� :" + message);
				print.println(message);
				if(message.equals("����") || message == null ) {
					System.out.println("***�ý����� �����մϴ�***");
					break;
				}
				
				String messag2 =reader.readLine();
				
				System.out.println("������ ���� �޼��� :" + messag2);

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
