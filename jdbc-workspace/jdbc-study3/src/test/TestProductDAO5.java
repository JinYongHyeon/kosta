package test;

import java.util.ArrayList;
import java.util.Scanner;

import step1.ProductDAO;
import step1.ProductDTO;

//PRODUCT TABLE에 상품정보를 조회하는 예제 조건문 이용 WHERE , 정렬 ORDER BY 
public class TestProductDAO5 {

	public void execute() {
		try {
			ProductDAO dao = new ProductDAO();
			int lowPrice = 2000; // 2000이상
			int hiPrice = 3000; // 3000이하
			// 상품 PRICE가 2000이상 3000이하 상품명 NAME과 가격 PRICE의 리스트를 조회 PRICE 내림차순
			ArrayList<ProductDTO> list = dao.getProductListByPriceOrderByDesc(lowPrice, hiPrice);
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TestProductDAO5().execute();
	}

}
