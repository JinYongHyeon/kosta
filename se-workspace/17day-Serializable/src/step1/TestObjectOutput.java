package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Person;

public class TestObjectOutput {

	public static void main(String[] args) {
		String savePath = "C:\\kosta203\\person.obj";
		try {
			FileOutputStream fo = new FileOutputStream(savePath);
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			Person p = new Person("홍길동", "우리집", "1234");
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
