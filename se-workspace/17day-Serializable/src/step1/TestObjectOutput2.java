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
			//NodeStream�迭 : FileInputStream�� file�� ����
			FileOutputStream fo = new FileOutputStream(savePath);
			//ProcessingStream �迭 : ObjectInputStream�� ��ü ������ȭ�� ����
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			Person2 p = new Person2("ȫ�浿", "�츮��", "1234");
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
