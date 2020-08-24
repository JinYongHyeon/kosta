package step2;
/*
 * 객체 생성 초기화 단계를 공부하는 예제
 */
public class TestObjectInit {

	public static void main(String[] args) {
		/*
		 * Car : 클래스명이자 참조형 데이터 타입
		 * car : 변수(지역변수, 참조변수)
		 * = : 할당 또는 대입
		 * new : 자바 예약어(키워드)
		 * Car() : 생성자 Constructor
		 */
		Car car = new Car();
		System.out.println(car.isFlag());//기본 초기화 false
		System.out.println(car.getPrice());//기본 초기화 0.0
		System.out.println(car.getModel());//기본 초기화 null
	}

}
