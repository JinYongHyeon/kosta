package step2.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1 대 1 서버, 클라이언트 프로그램
 * 서버는 클라이언트의 메세지를 입력받아 자신으 콘솔에 출력하고 (ip + 메세지) 그 메세지를 다시 클라이언트로 출력(메세지**server**)하는 작업을 지속적으로 수행한다.
 */
public class EchoServer {

	public void go() throws IOException {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader reader = null;
		PrintWriter print = null;

		try {

			server = new ServerSocket(5431);
			System.out.println("**서버 작동중**");
			socket = server.accept();
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			print = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				String message = reader.readLine();
				if(message== null)
					break;
				System.out.println(socket.getInetAddress() + " : " + message);

				print.println(message);
				/*if (message.trim().equals("종료")) {
					System.out.println("***시스템을 종료합니다.***");
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
