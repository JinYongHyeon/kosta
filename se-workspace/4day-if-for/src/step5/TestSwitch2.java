package step5;

import java.util.Scanner;

public class TestSwitch2 {

	public static void main(String[] args) {
		/*
		 * grade 1 이면 하버드 2이면 북경대 3,4,5 카네기멜론 나머지 스탠포드
		 */
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			System.out.println("하버든");
			break;
		case 2:
			System.out.println("북경대");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("카네기멜론");
			break;
		default:
			System.out.println("스탠포드");
			break;
		}
		sc.close();
	}

}
