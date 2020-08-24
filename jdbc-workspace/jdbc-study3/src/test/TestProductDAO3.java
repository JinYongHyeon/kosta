package test;

import java.util.Scanner;

import step1.ProductDAO;

/*
 * 아이디에 대한 상품이 존재하는 지 유무를 반환한다.
 */
public class TestProductDAO3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			ProductDAO dao = new ProductDAO();
			String id= sc.nextLine();
			
			if (dao.isExistProduct(id)) {
				System.out.println("아이디에 해당하는 상품이 존재합니다.");
			} else {
				System.out.println("아이디에 해당하는 상품이 존재하지않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
