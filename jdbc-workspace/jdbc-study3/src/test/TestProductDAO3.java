package test;

import java.util.Scanner;

import step1.ProductDAO;

/*
 * ���̵� ���� ��ǰ�� �����ϴ� �� ������ ��ȯ�Ѵ�.
 */
public class TestProductDAO3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			ProductDAO dao = new ProductDAO();
			String id= sc.nextLine();
			
			if (dao.isExistProduct(id)) {
				System.out.println("���̵� �ش��ϴ� ��ǰ�� �����մϴ�.");
			} else {
				System.out.println("���̵� �ش��ϴ� ��ǰ�� ���������ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
