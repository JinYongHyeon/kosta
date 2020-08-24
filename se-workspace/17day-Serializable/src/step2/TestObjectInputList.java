package step2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import model.Product;

public class TestObjectInputList {
	@SuppressWarnings("unchecked") //체크되지 않은 연산에 대한 경고를 무시하겠다
	public static void main(String[] args) {
		String savePath = "C:\\kosta203\\productList.obj";
		ArrayList<Product> list = null;
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream(savePath);
			 ois = new ObjectInputStream(fis);
			
			

			
			list = (ArrayList<Product>) ois.readObject();
			
			/*for (Product p2 : list) {
				System.out.println(p2);
				System.out.println(p2.getName());
			}*/
			ois.close();
		} catch (IOException e) {
			System.out.println(ois);
			System.out.println(list);
			System.out.println("1");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}

	}

}
