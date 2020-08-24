package step5;

//abstract method가 하나 이상 존재하면 그 클래스는 abstract로 선언되어야 한다.
abstract class Parent {

	public Parent() {
		System.out.println("Parent 생성자");
	}

	public void eat() {
		System.out.println("먹다");
	}

	// abstract 메서드는 구현부를{} 가질 수 없다. 오직 선언만 가능
	public abstract void study();

}

class Child extends Parent {

	@Override
	public void study() {
		System.out.println("Child 공부하다");
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		// Parent p2 = new Parent(); abstract class이므로 직접 객체 생성할 수 없다.
		Child p = new Child();
		p.study();
		p.eat();
	}

}
