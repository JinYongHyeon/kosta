package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestInput1 {

	public static void main(String[] args) {
		//���Ϸκ��� ������ �Է¹޴� ��Ʈ�� ����
		String path ="C:"+File.separator+"kosta203"+File.separator+"iotest2"+File.separator+"order.txt";
		try {
		//���Ͽ� ����Ǿ� �Է¹޴� ��彺Ʈ��
		FileReader fr = new FileReader(path);
		//������ ������ �Է¹޴� ���μ��� ��Ʈ��
		BufferedReader br = new BufferedReader(fr);
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		/*
		String name= null;
		while((name = br.readLine())!= null) {
			System.out.println(name);
		}
		*/
		while(br.ready()) {
			System.out.println(br.readLine());
		}
		br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
