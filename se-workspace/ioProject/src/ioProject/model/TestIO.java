package ioProject.model;

import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******�޴� ������ ���ּ���******");
		try {
			while (true) {
				System.out.println("1�� ���丮 2��  ���� 3�� ����");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("1��");
					break;
				case 2:
					System.out.println("2��");
					break;
				case 3:
					System.out.println("����");
					return;
				default:
					System.out.println("��ȣ�� �߸� �Ǿ����ϴ�. �ٽ� �Է����ֽʽÿ�.");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
