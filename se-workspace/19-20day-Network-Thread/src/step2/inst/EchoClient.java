package step2.inst;

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
			socket = new Socket(IP.INST, 5432);
			print = new PrintWriter(socket.getOutputStream(),true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				
				String message = scanner.nextLine();
				System.out.println("서버에 보낼 메세지 :" + message);
				print.println(message);
				String messag2 =reader.readLine();
				if(messag2.equals("종료")) {
					System.out.println("***시스템을 종료합니다***");
					break;
				}
				System.out.println("서버에 받은 메세지 :" + messag2);

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
			System.out.println("asd2");
			e.printStackTrace();
		}
	}

}
