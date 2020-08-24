package step4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {

	public void order(String path) throws IOException { // throws
		Scanner sc = new Scanner(System.in); // 콘솔에 입력되는 스트림
		// 파일에 출력할 스트림
		PrintWriter pw = new PrintWriter(new FileWriter(path),true); //true : autoflush
		System.out.println("***점심메뉴***");
		while (true) {
			System.out.println("***메뉴를 입력하세요***");
			String menu = sc.nextLine();
			if (menu.equals("주문끝")) {
				break;
			}
			pw.println(menu);
		}
		System.out.println("****주문완료****");
		System.out.println(path + "에 주문목록이 저장되었습니다.");
		sc.close();
		pw.close();
	}

}
