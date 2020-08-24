package step2;

public class TestException1 {
	
	
	public static void main(String[] args) {

		/*Exception 발생하면 프로그램이 실행 중단한다.
		 * Exception 발생하면 프로그램이 실행 중단한다.
		 * Exception 발생하면 JVM은 예외 정보 전달 후 비정상종료
		 * Exception 주요 키워드인 try catch를 이용해 예외 처리를 하고 프로그램을 정상실행하도록 해본다.
		 */
		String name="홍길동";
		name = null;
		try {
			System.out.println(name.length());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("이름이 존재하지 않습니다.");
		}
		System.out.println("프로그램 정상 수행");
	}

}
