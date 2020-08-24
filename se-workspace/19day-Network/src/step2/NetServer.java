package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 서버는 클라이언트 접속 대기하다가 접속해서 메세지를 전송하면 그 메세지를 자신의 콘솔에 ip와 함께 출력하고 다시 대기
 */
public class NetServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		try {
			serverSocket = new ServerSocket(5430);
			System.out.println("***step2.NetServer서버실행***");
			while (true) {
				try {
					socket = serverSocket.accept();
					InputStreamReader isr = new InputStreamReader(socket.getInputStream());
					
					br = new BufferedReader(isr);
					System.out.println(socket.getInetAddress()+" : "+br.readLine());
					
				} finally {
					if (br != null)
						br.close();
					if (socket != null)
						socket.close();
				}
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}

	}



	public static void main(String[] args) {
		try {
			new NetServer().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
