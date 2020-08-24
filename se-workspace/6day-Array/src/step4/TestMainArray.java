package step4;
//도스 실행창에서 실행 -> java step4.TestMainArray 오킹 우정잉 단장002
public class TestMainArray {

	public static void main(String[] args) { //실행 시점에서  args 배열이 적용된다.
		// 위 메인 메서드 매개변수 배열을 이용해 보는 예제
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("메인메서드 종료");
	}

}
