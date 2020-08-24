package step2.inst;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1�� �� , �� �ټ��� Ŭ���̾�Ʈ���� ���������� �޾Ƹ� �����ϴ� ����
 */
public class MutiServer {
	/*
	 * ServerSocket ����
	 * while loop
	 * accept() : Socket �� ���� ���Ӵ��
	 * �����ϸ� Socket�� ��ȯ
	 * ServerWorker Thread�� ������ �� �����ڿ� �ش� Socket�� �Ҵ� start()�� �̿��� �ش罺���带 ���డ�ɻ��·� ������ 
	 */
	
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("***step4.MultServer***");
			while(true) {
			Socket socket = serverSocket.accept(); //Ŭ���̾�Ʈ �����ϸ� ���� , �Ϲݼ����� ��ȯ�Ѵ�.
			System.out.println(socket.getInetAddress()+"�� �����߽��ϴ�.");
			//���� Ŭ���̾�Ʈ�� ����� ��ü �����ÿ� ������ �Ҵ��Ѵ�. ���� ��ü�� ���� ��ȭ�⸦ �Ѱ��ش�.
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
