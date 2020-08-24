package step2;

public class TestException3 {
	/*
	 * Exception 예외 발생시 실행의 흐름을 알아보는 예제
	 */
	public static void main(String[] args) {
		
		String age ="스물한살"; // 실행결과 예상 
		try {
		int intAge =Integer.parseInt(age);	
		System.out.println(intAge+1);
		}catch(NumberFormatException e) {

			e.getMessage();
			e.printStackTrace();
			System.out.println("A");
		}catch(Exception b) {
			b.printStackTrace();
			System.out.println("B");
		}
		System.out.println("c");
	}

}
