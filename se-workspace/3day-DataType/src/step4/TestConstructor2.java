package step4;

public class TestConstructor2 {

	public static void main(String[] args) {
		CreditCard c = new CreditCard("�ѽ����̽�");
		
		System.out.println(c.getCusomerInfo());
		
		c.setCusomerInfo("���� ��������");
		System.out.println(c.getCusomerInfo());
		
	}

}
