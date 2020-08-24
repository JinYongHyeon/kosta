package step1;

//자바 연산사 테스트
public class TestOperator1 {

	public static void main(String[] args) {
		int i = 7;
		int j = 3;

		System.out.println(i + "*" + j + "=" + i * j);
		System.out.println(i + "/" + j + "=" + i / j);
		System.out.println(i + "%" + j + "=" + i % j);
		System.out.println(i + "=" + j + "=" + (i = j));
		System.out.println(i + "==" + j + "=" + (i == j));

		boolean flag = false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("***증감연산자***");

		int k = 7;
		System.out.println(k++); // 실행 후 증가
		System.out.println(k);
		System.out.println(++k); // 증가 후 실행
		System.out.println(k);
		System.out.println(--k);
		System.out.println(k--); // 8
		System.out.println(k); // 7
		System.out.println("*********");

		int money = 100;
//		money= money+200; 
		money+=250;
		System.out.println(money);
		money-=100; // money = money-100; equals(true)
		System.out.println(money);
		System.out.println("*********");
		//삼항연산자 (조건식)? 식1 : 식2 --> 조건이 참이면 식1 거짓이면 식2 실행\
		int x= 10;
		int result = (x>0)? x+1:x+2;
		System.out.println(result);
		
	}
}
