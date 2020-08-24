package step3;

public class TestStatic1 {
	//Object의 member (instance variable)
	//아래 money 변수와, test 메서드는 객체 생성을 할 떄만 메모리에 로드되고 사용가능하다.
	int money = 100;

	public void test() {

	}
	//Class의 Member인 static 변수와 메서드는 실행 첫시점 즉 class loading 시점에 메모리에 적재된다. 즉 별도의 객체 생성이 필요없다.
	static int sMoney = 100;

	public static void stest() {
		System.out.println("asd");
	}

	public static void main(String[] args) {
		/*
		 * 아래 코드는 complie error -> 이유는 static method 내부이므로 non-static(Object의 member)에게
		 * 직접 접근할 수 없도록 문법적으로 지정되어 있다. 즉 static 에서 non-staitc 으로 직접 접근할 수 없다.
		 * System.out.println(money); test(); 같은 static 끼리는 접근 가능
		 */
		System.out.println(sMoney);
		stest();
	}
}
