package test;

import java.util.Scanner;

import step1.ProductDAO;
import step1.ProductDTO;
/*
 * PRIMARY KEY�� PRODUCT ID�� ��ǰ������ �˻��ϴ� ����
 */
public class TestProductDAO1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String id = sc.nextLine();
			ProductDAO dao = new ProductDAO();
			ProductDTO dto = dao.findProductById(id);
			if (dto == null) {
				System.out.println(id + "���̵� �ش��ϴ� ��ǰ�� �����ϴ�.");
			} else {
				System.out.println("�˻� ��� : " + dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
