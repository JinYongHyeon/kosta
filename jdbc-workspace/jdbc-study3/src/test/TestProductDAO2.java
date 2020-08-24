package test;

import step1.ProductDAO;

/*
 * 총 상품수를 반환받는 예제 : ResultSet 의 getInt()를 이용하면 된다.
 */
public class TestProductDAO2 {

	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int totalCount = dao.getTotalCount();
			if (totalCount == 0) {
				System.out.println("아이디에 해당하는 상품이 없습니다.");
			} else {
				System.out.println("총상품 수  : " + totalCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
