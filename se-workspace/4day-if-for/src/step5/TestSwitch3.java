package step5;

import java.util.Scanner;

public class TestSwitch3 {

	public static void main(String[] args) {
		/*
		 * 2�� 28�� 4,6,9,11�� : 30�� 1,3,5,7,8,10,12 31��
		 */
		DataService service = new DataService();
		Scanner sc = new Scanner(System.in);
		service.printLiastDay(sc.nextInt());
		//7�� ������ ���� 31���Դϴ�.
		sc.close();
	}

}
