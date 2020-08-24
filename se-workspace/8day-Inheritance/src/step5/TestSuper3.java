package step5;
class Animal{
	int age;
	
//	public Animal() {
//	}

	public Animal(int age) {
		super();
		this.age = age;
	}
	
	
}
class Person extends Animal{
	String name;
	public Person(String name,int age) {
		//super(); 오버로딩 생성자 만들어져서 기본 생성자가 자동으로 생성이 안됨. 슈퍼 기본생성자가 안 만들어져서 찾지 못함 error
		super(age);
		this.name=name;
		
	}
}
public class TestSuper3 {

	public static void main(String[] args) {	
		Person p = new Person("홍길동",123);
		System.out.println(p.name + p.age);
	}

}
