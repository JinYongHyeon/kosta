package test;

import model.CardDAO;
import model.CardDAO2;

/**
 * Ʈ����� ó���� ���� �ʾ��� �� �߻��Ǵ� ������ Ȯ���ϴ� ���� ī�� ���̺� ī�� ������ insert�� �ǰ� ����Ʈ ���̺� ����Ʈ ������
 * insert �� �� ������ �߻��Ǿ��� �� ����Ʈ ������ ��ϵ��� �ʰ� ī�� ������ �����ϴ� ��츦 ����� ����. -> ���� ����
 * 
 * @author kosta
 *
 */
public class TestTransaction1 {

	public static void main(String[] args) {
		try {
			CardDAO dao = new CardDAO();
			dao.registerCardAndPoint("java2", "�����", "�Ե�", 1000); // id, name , point_type,point
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ī�� �߱ް����� ������ �߱��� ���� �ʾҽ��ϴ�.");
		}
	}

}

