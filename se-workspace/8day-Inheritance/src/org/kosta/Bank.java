package org.kosta;

/*
 * ���� ������ �׽�Ʈ  step2.TestAccessModifier ���� �����Ѵ�.
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
