package step2;

import org.kosta.Bank;

class KostaBank extends Bank {
	public void test() {
		publicTest();
		//��� ���迡 ���� ��, �ٸ� ��Ű���� ������ ���� ������ ^^7 OWO  ��������
		protectedTest();
	}
}	

public class TestAccessModifier {

	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.publicTest();
		/*
		 * bank.protectedTest(); ����ϸ� ��� �԰��� bank.defualtTest(); ��Ű�� �޶� �� �ҷ���
		 * bank.privateTest(); �׳� �� �� �ƹ�ư �� �� �ڱ� Ŭ���� �ȿ����� ��� ����
		 */
	}

}
