package step5;

import java.util.Scanner;

public class TestSwitch2 {

	public static void main(String[] args) {
		/*
		 * grade 1 �̸� �Ϲ��� 2�̸� �ϰ�� 3,4,5 ī�ױ��� ������ ��������
		 */
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			System.out.println("�Ϲ���");
			break;
		case 2:
			System.out.println("�ϰ��");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("ī�ױ���");
			break;
		default:
			System.out.println("��������");
			break;
		}
		sc.close();
	}

}
