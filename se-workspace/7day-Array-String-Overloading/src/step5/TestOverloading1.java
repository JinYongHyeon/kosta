package step5;

class Person {
	public void eat() {
		System.out.println("먹다");
	}

	/*
	 * 오버로딩(메서드) : 동일한 이름의 메서드로 매개변수를 다르게 하는 기법-> 사용자 편의성
	 */
	public void eat(String name) {
		System.out.println(name + "먹다.");
	}

	/*
	 * 메서드 오버로딩 : 매개변수으 순서, 타일, 개수가 다르면 오버로딩으로 인식한다.
	 */
	public void eat(int count) {
		System.out.println(count + "번 먹다");
	}

	public void eat(int count, String name) {
		System.out.println(name + "을" + count + "번" + "먹다");
	}
}

public class TestOverloading1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.eat("스테이크");
		p.eat(15);
		p.eat(15,"스테이크");
		
		
	}
}
