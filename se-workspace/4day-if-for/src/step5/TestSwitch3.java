package step5;

import java.util.Scanner;

public class TestSwitch3 {

	public static void main(String[] args) {
		/*
		 * 2월 28일 4,6,9,11일 : 30일 1,3,5,7,8,10,12 31일
		 */
		DataService service = new DataService();
		Scanner sc = new Scanner(System.in);
		service.printLiastDay(sc.nextInt());
		//7월 마지막 일은 31일입니다.
		sc.close();
	}

}
