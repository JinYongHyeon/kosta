package step2.method2;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int result = c.plus(2,5);
		System.out.println("더하기 결과 :" + result);	
		
		int result2 = c.minus(10, 5);
		System.out.println("빼기 값 :" + result2);
		
	}
}
