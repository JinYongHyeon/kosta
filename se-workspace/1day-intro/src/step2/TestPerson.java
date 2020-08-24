package step2;

public class TestPerson {

	public static void main(String[] args) {
		
		//Person class를 이용해  Person 객체를 생성한다.
		Person ps = new Person();
		//Person class의 name 변수에 이름을 저장한다.
		ps.name = "홍길동";
		//ps 객체의 name을 출력한다.
		System.out.println(ps.name);
		//ps 객체이 eat() 메소드[함수]를 실행해본다
		ps.eat();	
	}

}
