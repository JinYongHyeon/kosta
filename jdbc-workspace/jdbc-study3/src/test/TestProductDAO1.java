package test;

import java.util.Scanner;

import step1.ProductDAO;
import step1.ProductDTO;
/*
 * PRIMARY KEY인 PRODUCT ID로 상품정보를 검색하는 예제
 */
public class TestProductDAO1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String id = sc.nextLine();
			ProductDAO dao = new ProductDAO();
			ProductDTO dto = dao.findProductById(id);
			if (dto == null) {
				System.out.println(id + "아이디에 해당하는 상품이 없습니다.");
			} else {
				System.out.println("검색 결과 : " + dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
