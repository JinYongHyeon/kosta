package step2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Product;

public class TestObjectOutputList {

	public static void main(String[] args) {
		String savePath = "C:\\kosta203\\productList.obj";
		ArrayList<Product> list = new ArrayList<Product>();

//		list.add(new Product("a", "���̽�", "����"));
//		list.add(new Product("b", "ī��", "����"));
//		list.add(new Product("c", "ó��ó��", "�Ե�"));
		// FileOutputStream , ObjectOutputStream writeObject()�� �̿��ؼ� list�� ����ȭ�Ͽ� ��
		// savepath�� ���Ϸ� ����
		try {
			FileOutputStream fos = new FileOutputStream(savePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			//oos.writeObject(list);
			System.out.println("����");
			oos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
