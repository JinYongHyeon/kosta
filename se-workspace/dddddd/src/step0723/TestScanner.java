package step0723;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		if(a.equals("선택")) {
			System.out.print("했다.");
		}
		
		sc.close();
	}

}
