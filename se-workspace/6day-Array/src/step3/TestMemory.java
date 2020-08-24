package step3;

class Person{
	private String name;
	
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Exam{
	public void test1(Person p ) {
		p = new Person("자야");
	}
	
	public void test2(Person p) {
		p.setName("라칸");  
	}
}

public abstract class TestMemory {

	public static void main(String[] args) {
		Person p = new Person("마동석");
		Exam e = new Exam();
		e.test1(p); 
		System.out.println(p.getName());//로컬변수 인직! 마동석 WIN
		e.test2(p);
		System.out.println(p.getName()); //라칸
	}

}
