package step0723;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		if(a.equals("����")) {
			System.out.print("�ߴ�.");
		}
		
		sc.close();
	}

}
