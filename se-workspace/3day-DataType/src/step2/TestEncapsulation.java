package step2;
/*
 * 아래 코드에 대응되는 클래스를 구현해보는 예제
 * 
 */
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData d = new MyData();
		//d.day=2;s//접근불가
		
		d.setDay(10);
		System.out.println(d.getDay());
		
		System.out.println("*************");
		
		MyData d2 = new MyData();
		d2.setDay(32); // 32일 잘못된 입력값입니다.
		System.out.println(d2.getDay() + "일"); //1일 지정
		
	}

}
