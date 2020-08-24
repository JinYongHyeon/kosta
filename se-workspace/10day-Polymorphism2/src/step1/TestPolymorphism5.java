package step1;

class Animal {
	public void sleep() {
		System.out.println("자다");
	}

	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal {
	//메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의
	@Override
	public void eat() {
		System.out.println("사람이 수저로 먹다.");
	}
	//자신의 독자적인 메서드
	public void study() {
		System.out.println("사람이 공부하다.");
	}

}

public class TestPolymorphism5 {

	public static void main(String[] args) {
		//부모타입의 변수에 자식 객체를 참조 시킬 수 있다.
		Animal a = new Person();
		//이 경우 바로 접근하여 사용가능한 것은 부모로부터 상속받은 멤버(변수,메서드)와 오버라이딩한 메서드이다.
		a.eat();//오버라이딩한거
		a.sleep();//상속받은거
		/*
		 * 자식의 독자적인 멤버는 접근하기 위해서 Object down casting이 필요하다
		 */
		Person p = (Person) a;
		p.study();
	}

}
