package step2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestOutput2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("������");
		list.add("�̼���");
		list.add("�ڽ���");
		list.add("������");

		// File file = new File("C:\\kosta203\\iotest");

		// friend.txt
		try {
			FileWriter fw = new FileWriter("C:\\kosta203\\iotest\\friend.txt");
			PrintWriter pw = new PrintWriter(fw);
			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));

			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
