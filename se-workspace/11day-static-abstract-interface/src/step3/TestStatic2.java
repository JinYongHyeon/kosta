package step3;

class Person{
	static int age=21;//class의 member -> 별도 객체 생성 없이 사용가능
	public static void eat() {
		System.out.println("static eat");
		//play(); static eat() 메서드는 객체생성이 실행 가능하고 play 메소드는 반드시 객체 생성되어야만 실행하기 떄문에 compile error
	}
	//non-stiatc 즉 Object의 멤버(메서드)는 객체 생성해야 사용가능
	public void play() {
		System.out.println("object play");
		eat(); //되는 이유는 play가 실행되었다는 것은 객체 생성을 전제로 하고 객체 생성 전에 class loading이 일어나기 때문에 당연히 접근 가능
	}
}

public class TestStatic2 {
	
	public static void main(String[] args) {
		/*
		 * age는 static 이므로 별도의 객체 생성없이 사용할 수 있다.
		 * 프로그램 실행시 첫시점에 class loading이 되고 그 떄 static이 메모리에 적재되므로
		 */
		System.out.println(Person.age);
		Person.eat();//객체 생성없이 클래스명.메서드()로 실행가능
		//Person.play(); object 의 member이므로 객체 생성이 필요
		Person p = new Person();
		p.play(); //이렇게 사용해야 함
	}
}
