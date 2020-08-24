package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.IP;

public class EchoClient2 {
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
			int point =0;
			while (true) {
				
				
				print.println("테스트"+point++);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			/*	if(message.equals("종료") || message == null ) {
					System.out.println("***시스템을 종료합니다***");
					break;
				}*/
				
				String messag2 =reader.readLine();
				
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
			new EchoClient2().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
