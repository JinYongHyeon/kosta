package test;

import java.util.ArrayList;
import java.util.Scanner;

import step1.ProductDAO;
import step1.ProductDTO;

//PRODUCT TABLE�� ��ǰ������ ��ȸ�ϴ� ���� ���ǹ� �̿� WHERE , ���� ORDER BY 
public class TestProductDAO5 {

	public void execute() {
		try {
			ProductDAO dao = new ProductDAO();
			int lowPrice = 2000; // 2000�̻�
			int hiPrice = 3000; // 3000����
			// ��ǰ PRICE�� 2000�̻� 3000���� ��ǰ�� NAME�� ���� PRICE�� ����Ʈ�� ��ȸ PRICE ��������
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
