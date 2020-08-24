package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Person2;

public class TestObjectOutput2 {

	public static void main(String[] args) {
		String savePath = "C:\\kosta203\\person.obj";
		try {
			//NodeStream계열 : FileInputStream은 file에 연결
			FileOutputStream fo = new FileOutputStream(savePath);
			//ProcessingStream 계열 : ObjectInputStream은 객체 역직렬화를 지원
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			Person2 p = new Person2("홍길동", "우리집", "1234");
			oos.writeObject(p);
			System.out.println("***객체 직렬화하여 파일이 Person 객체자장**** ");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
