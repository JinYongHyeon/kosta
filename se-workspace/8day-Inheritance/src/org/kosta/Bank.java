package org.kosta;

/*
 * 접근 제어자 테스트  step2.TestAccessModifier 에서 접근한다.
 */
public class Bank {
	public void publicTest() {
		System.out.println("public");
	}

	protected void protectedTest() {
		System.out.println("protected");
	}

	void defualtTest() {
		System.out.println("defualt");
	}

	private void privateTest() {
		System.out.println("private");
	}
}
