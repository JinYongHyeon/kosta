package test;

import java.util.Scanner;

import step1.ProductDAO;
import step1.ProductDTO;

//PRODUCT TABLE�� ��ǰ������ ����Ѵ�.
public class TestProductDAO4 {
	Scanner sc = new Scanner(System.in);

	public void execute() {
		try {

			ProductDAO dao = new ProductDAO();
			// ����� ��ǰ������ü
			// ProductDTO dto = new ProductDTO("4","���̽�","����",3000);
			String id = null;
			System.out.println("������ �Է��ϼ���");
			while (true) {
				System.out.print("���̵� �Է� : ");
				id = sc.nextLine();
				if (dao.isExistProduct(id)) {
					System.out.println(id + "���̵� ���� ��ǰ�� �����ϹǷ� ��ϺҰ�");
				} else {
					break;
				}
			}
			System.out.print("�̸� �Է� : ");
			String name = sc.nextLine();
			System.out.print("��ũ �Է� : ");
			String maker = sc.nextLine();
			System.out.print("���� �Է� : ");
			int price = sc.nextInt();

			dao.registerProduct(new ProductDTO(id, name, maker, price));
			System.out.println(dao.findProductById(id));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		new TestProductDAO4().execute();
	}

}
