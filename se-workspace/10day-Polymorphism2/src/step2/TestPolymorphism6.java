package step2;

import java.util.Scanner;

public class TestPolymorphism6 {
	public static void main(String[] args) {
		System.out.println("��ȣ [1]������ [2]ȣ���� [3]��� �߿� �Է��� �Ͻʽÿ�.");
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
			System.out.println("��ȣ�� �� �� �Է��ϼ̽��ϴ�. �ٽ� �Է����ֽʽÿ�.");
			main(args);
			break;
		}
		sc.close();
	
	
	
		
	}
}
