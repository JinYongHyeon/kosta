package step2.inst;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1대 다 , 즉 다수의 클라이언트에게 지속적으로 메아리 서비스하는 서버
 */
public class MutiServer {
	/*
	 * ServerSocket 생성
	 * while loop
	 * accept() : Socket 을 통해 접속대기
	 * 접속하면 Socket이 반환
	 * ServerWorker Thread를 생성할 떄 생성자에 해당 Socket을 할당 start()를 이용해 해당스레드를 실행가능상태로 보낸다 
	 */
	
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("***step4.MultServer***");
			while(true) {
			Socket socket = serverSocket.accept(); //클라이언트 접속하면 실행 , 일반소켓을 반환한다.
			System.out.println(socket.getInetAddress()+"님 접속했습니다.");
			//실제 클라이언트와 통신할 객체 생성시에 소켓을 할당한다. 상담원 객체를 만들어서 전화기를 넘겨준다.
			ServerWorker serverWorker = new ServerWorker(socket);
			Thread thread = new Thread(serverWorker);
			thread.start();
			}
		}finally {
			if(serverSocket != null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {

	}

}
