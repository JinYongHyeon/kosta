package step2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//출력스트림을 이용해 파일을 생성하고 데이터를 출력하는 예제
public class TestOutput1 {

	public static void main(String[] args) {
		//디렉토리를 생성, 존재하면 생성하지 않는다.
		File dir = new File("C:\\kosta203\\iotest");
		boolean result = dir.mkdir(); //mkdir은 상위 디렉토리 파일이 없으면 파일을 못 만들거 mkdirs는 상위 디렉토리 파일이 없으면 그것도 같이 만들어서 생성한다.
		System.out.println("디렉토리 생성"+result);
		
		try {
			//Node Strem 계열 : 파일이 없으면 생성하고 파일에 연결되는 스트림
			FileWriter fw = new FileWriter("C:\\kosta203\\iotest\\test1.txt",true);
			//Processing Stream 계열 : 다양한 기능을 지원
			PrintWriter pw = new PrintWriter(fw);
			BufferedWriter bw = new BufferedWriter(pw);
			pw.println("안녕 IO");
			pw.close();
			System.out.println("파일에 출력!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
