package step4.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {

	public void order(String path) throws IOException { // throws
		Scanner sc = new Scanner(System.in); // �ֿܼ� �ԷµǴ� ��Ʈ��
		// ���Ͽ� ����� ��Ʈ��
		PrintWriter pw = new PrintWriter(new FileWriter(path),true); //true : autoflush
		System.out.println("***���ɸ޴�***");
		while (true) {
			System.out.println("***�޴��� �Է��ϼ���***");
			String menu = sc.nextLine();
			if (menu.equals("�ֹ���")) {
				break;
			}
			pw.println(menu);
		}
		System.out.println("****�ֹ��Ϸ�****");
		System.out.println(path + "�� �ֹ������ ����Ǿ����ϴ�.");
		sc.close();
		pw.close();
	}

}
