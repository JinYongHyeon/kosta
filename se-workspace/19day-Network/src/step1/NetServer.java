package step1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer {

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		PrintWriter pw = null;
		try {
			serverSocket = new ServerSocket(5430); // 대표전화
			System.out.println("***서버실행***");
			while (true) {
				try {
				// 클라인언트 접속 대기하다 접속하면 실행, 일반소켓을 반환
				socket = serverSocket.accept();
				//접속한 클라이언트 아이피 반환
				System.out.println("***"+socket.getInetAddress()+"client 접속됨***");

				// 클라이언트에게 데이터를 전송하기 위해 노드 스트림을 반환
				OutputStream os = socket.getOutputStream();
				pw = new PrintWriter(os);
				pw.println("Welcome My Server!!");
				}finally {
					if (pw != null)
						pw.close();
					if(socket != null)
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
			e.printStackTrace();
		}
	}

}
