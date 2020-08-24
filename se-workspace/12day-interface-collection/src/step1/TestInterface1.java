package step1;
interface Flyer2{
	
}
interface Flyer { //상위 인터페이스
	//별도의 선언이 없어도 public static final로 된다
	String ID="javaking";
	
	// public abstract void fly();
	public void fly(); // abstract를 별도로 명시하지 않아도 됨.
	
	public default void fly2() {System.out.println("ㅁㄴㅇ");}
}	

class Animal {

}

class Person extends Animal {

}

class Bird extends Animal implements Flyer { //하위 구현체
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("새가 날다");

	}
}
	class Airplane implements Flyer {

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("비행기가 날다");
			
		}
	}

public class TestInterface1 {

	public static void main(String[] args) {
		//인터페이스 문법을 확인하는 예제
		//Animal a = new Airplance(); error, 상위 타입만 가능
		
		//상위 인터페이스 타입으로 하위 객체를 참조할 수있따 다형성이 적용됨
		Flyer f1 = new Bird();
		Flyer f2 = new Airplane();
		
		f1.fly();
		f1.fly2();
		f2.fly();
		
	}

}
