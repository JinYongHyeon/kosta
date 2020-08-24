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
			Person p = new Person("ȫ�浿", "�츮��", "1234");
			oos.writeObject(p);
			System.out.println("***��ü ����ȭ�Ͽ� ������ Person ��ü����**** ");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
