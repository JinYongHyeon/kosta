package step4;

import java.util.TreeSet;

public class TestLotto {
	public static void main(String[] args) {
		//1 ~45���� �ߺ����� ���� ������ �� 6���� TreeSet�� ��� ��ȯ
		LottoService service = new LottoService();
		
		TreeSet<Integer> set = service.createLottoNumber();
		System.out.println("�̹��� �ζ� ��ȣ"+set);
		
	}
}
