package step2.method1;

public class TestPerson {

	public static void main(String[] args) {
		//Person class를 이용해 객체를 생성한다 p
		Person p = new Person();
		
		//p 객체의 eat() 메서드를 호출해서 실행시킨다.
		p.eat();
		p.eat2("맥주");
		p.eat2("막걸리");
		p.eat3("스테이크",4);
		
		String name = p.eat4("부대찌게");
		System.out.println(name);
		
	
		
		
	}

}
