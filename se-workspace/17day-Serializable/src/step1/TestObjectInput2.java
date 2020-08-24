package step1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Person2;

public class TestObjectInput2 {
	public static void main(String[] args) {
		String savePath = "C:\\kosta203\\person.obj";
		try {
			//노드스트림 : 직접 장치 연결, FileOutputStrema은 파일에 연결되는 노드스트림
			FileInputStream fis = new FileInputStream(savePath);
			//프로세스스트림 : 기능을 지원, ObjectOutputStream은 객체 직렬화해 전송
			ObjectInputStream ois = new ObjectInputStream(fis);	
			
			//Object 타입으로 반환되므로 객체 캐스팅을 이용해서 정보를 확인
			Person2 p =(Person2)ois.readObject();
			System.out.println(p.getName());
			System.out.println(p.getAddress());
			System.out.println(p.getPassword());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
