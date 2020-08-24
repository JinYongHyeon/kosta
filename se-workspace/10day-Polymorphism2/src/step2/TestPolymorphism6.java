package step2;

import java.util.Scanner;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		System.out.println("번호 [1]원숭이 [2]호랑이 [3]사람 중에 입력을 하십시오.");
		ZooSerivce service = new ZooSerivce();		
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		switch (number) {
		case 1:
			service.execute(new Monkey());
			break;
		case 2:
			service.execute(new Tiger());	
			break;
		case 3:
			service.execute(new Person());
			break;
		default:
			System.out.println("번호를 잘 못 입력하셨습니다. 다시 입력해주십시오.");
			main(args);
			break;
		}
		sc.close();
	
	
	
		
	}
}
