package step1;

import java.util.Scanner;

public class TestScanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.in ����â �Է� ��ü
		while(true) {
		String info=sc.nextLine();
		System.out.println("�Է¹��� �޼��� : "+info);
		if(info.equals("�׸�"))break;
		}
		sc.close();//�ڿ��� ����
	}

}
