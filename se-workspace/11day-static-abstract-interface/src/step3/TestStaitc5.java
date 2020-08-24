package step3;

/*
 * static 초기화 블럭 테스트 예제
 * main 보다 먼저 실행된다.
 * static 초기화 영역은 가장 먼저 실행된다.
 */
public class TestStaitc5 {

	public static void main(String[] args) {
		System.out.println("눈치게임 2 / main 메소드 실행");
	}

	static { //프로그램 사전작업
		System.out.println("눈치게임 1"); //static 초기영역 실행
	}
}
