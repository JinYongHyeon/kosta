package step4;

public class TestConstructor2 {

	public static void main(String[] args) {
		CreditCard c = new CreditCard("롤스로이스");
		
		System.out.println(c.getCusomerInfo());
		
		c.setCusomerInfo("녹턴 개인정보");
		System.out.println(c.getCusomerInfo());
		
	}

}
