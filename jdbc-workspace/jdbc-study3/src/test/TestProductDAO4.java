package test;

import java.util.Scanner;

import step1.ProductDAO;
import step1.ProductDTO;

//PRODUCT TABLE에 상품정보를 등록한다.
public class TestProductDAO4 {
	Scanner sc = new Scanner(System.in);

	public void execute() {
		try {

			ProductDAO dao = new ProductDAO();
			// 등록할 상품정보객체
			// ProductDTO dto = new ProductDTO("4","참이슬","진로",3000);
			String id = null;
			System.out.println("정보를 입력하세요");
			while (true) {
				System.out.print("아이디 입력 : ");
				id = sc.nextLine();
				if (dao.isExistProduct(id)) {
					System.out.println(id + "아이디에 대한 상품이 존재하므로 등록불가");
				} else {
					break;
				}
			}
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			System.out.print("마크 입력 : ");
			String maker = sc.nextLine();
			System.out.print("가격 입력 : ");
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
