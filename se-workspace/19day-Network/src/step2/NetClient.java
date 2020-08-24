package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class NetClient {
	public void go() throws UnknownHostException, IOException {
		Scanner scanner = null;
		Socket socket = null;
		PrintWriter pw = null;

		try {
			scanner = new Scanner(System.in);
			while (true) {
				try {
					socket = new Socket(IP.LOCAL,5430);
					OutputStream os = socket.getOutputStream();
					pw = new PrintWriter(os, true); // true autoFlush
					System.out.print("보낼 메세지 : ");
					String message = scanner.nextLine();
					if (message.contentEquals("종료"))
						break;
					pw.println(message);
					System.out.println("***서버에 접속해서 메세지 전송***" + message);
					
				} finally {
					if (pw != null)
						pw.close();
					
				}
			}
		} finally {
			if(scanner != null)
				scanner.close();
			if (socket != null)
				socket.close();

		}
	}

	public static void main(String[] args) {
		try {
			new NetClient().go();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
