package step2;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0; i<5;i++) { //nextInt(3) 0 ~ 2 �� �������� ��ȯ
			System.out.println(r.nextInt(3)+1);
		}
	}

}
