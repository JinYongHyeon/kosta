package test;

import model.CardDAO2;

/**
 * Ʈ����� ó���� ���� �ʾ��� �� �߻��Ǵ� ������ Ȯ���ϴ� ���� ī�� ���̺� ī�� ������ insert�� �ǰ� ����Ʈ ���̺� ����Ʈ ������
 * insert �� �� ������ �߻��Ǿ��� �� ����Ʈ ������ ��ϵ��� �ʰ� ī�� ������ �����ϴ� ��츦 ����� ����. -> ���� ����
 * 
 * @author kosta
 * Ʈ����� ó����  ���� ��� �۾��� ���������� ����Ǿ��� �� COMMIT �����߻��� ROLLBACK
 * 
 * �׽�Ʈ 1 : ���������� �����͸� �Է��� COMMIT Ȯ��
 * �׽�Ʈ 2 : POINT ��Ͻ� ���Ƿ� ������ �߻����� ROLLBACK�� �Ǵ� �� Ȯ��
 */
 class TestTransaction2 {

	public static void main(String[] args) {
		try {
			CardDAO2 dao = new CardDAO2();
			dao.registerCardAndPoint("java2", "�����", "�Ե�", 1000); // id, name , point_type,point
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}