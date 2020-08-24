package step0;
/* Nested class : 중첩 클래스 or Inner class
 * 클래스 안의 클래스를 정의
 * 내부 클래스를 정의하는 이유는 Outer class의 private member에 직접 접근해 사용할 수 있기 때문에 주로 쓴다
 */
class Outer{
	private String password = "abcd";
	public void outTest() {
		Inner in = new Inner();
		in.innerTest();
		
	}
	class Inner{
		public void innerTest() {
			//Outer class의 private 변수에 직접 접근해 사용할 수 있음.
			System.out.println(password);
		}
	}
}
public class TestNestedClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outTest();
		//Inner class를 이용해 객체 생성하고 메서드를 호출
		Outer.Inner in = new Outer().new Inner();
		in.innerTest();
	}
}
