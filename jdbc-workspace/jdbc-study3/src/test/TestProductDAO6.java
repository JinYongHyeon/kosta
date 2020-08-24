package test;

import java.util.ArrayList;

import step1.ProductDAO;
import step1.ProductDTO;

public class TestProductDAO6 {

	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int percent = 10; // 10%할인된 가격으로 조회하되 price 오름차순 정렬
			ArrayList<ProductDTO> list = dao.getProductListDiscountPrice(percent);
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getName() + " : " + list.get(i).getPrice());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
