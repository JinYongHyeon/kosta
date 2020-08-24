package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestInput1 {

	public static void main(String[] args) {
		//파일로부터 정보를 입력받는 스트림 예제
		String path ="C:"+File.separator+"kosta203"+File.separator+"iotest2"+File.separator+"order.txt";
		try {
		//파일에 연결되어 입력받는 노드스트림
		FileReader fr = new FileReader(path);
		//파일의 정보를 입력받는 프로세스 스트림
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
