package step1;

import java.util.Scanner;

public class TestScanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.in 실행창 입력 객체
		while(true) {
		String info=sc.nextLine();
		System.out.println("입력받은 메세지 : "+info);
		if(info.equals("그만"))break;
		}
		sc.close();//자원을 해제
	}

}
