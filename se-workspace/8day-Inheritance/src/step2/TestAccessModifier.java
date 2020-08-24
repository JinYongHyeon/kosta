package step2;

import org.kosta.Bank;

class KostaBank extends Bank {
	public void test() {
		publicTest();
		//상속 관계에 있을 때, 다른 패키지라도 접근이 가능 ㅇㅅㅇ ^^7 OWO  ㅋㅋㅋㅋ
		protectedTest();
	}
}	

public class TestAccessModifier {

	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.publicTest();
		/*
		 * bank.protectedTest(); 상속하면 사용 쌉가능 bank.defualtTest(); 패키지 달라서 못 불러옴
		 * bank.privateTest(); 그냥 못 씀 아무튼 못 씀 자기 클래스 안에서만 사용 가능
		 */
	}

}
