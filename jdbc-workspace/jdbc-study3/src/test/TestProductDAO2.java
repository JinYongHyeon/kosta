package test;

import step1.ProductDAO;

/*
 * �� ��ǰ���� ��ȯ�޴� ���� : ResultSet �� getInt()�� �̿��ϸ� �ȴ�.
 */
public class TestProductDAO2 {

	public static void main(String[] args) {
		try {
			ProductDAO dao = new ProductDAO();
			int totalCount = dao.getTotalCount();
			if (totalCount == 0) {
				System.out.println("���̵� �ش��ϴ� ��ǰ�� �����ϴ�.");
			} else {
				System.out.println("�ѻ�ǰ ��  : " + totalCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
