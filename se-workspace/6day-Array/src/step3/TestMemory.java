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
		p = new Person("�ھ�");
	}
	
	public void test2(Person p) {
		p.setName("��ĭ");  
	}
}

public abstract class TestMemory {

	public static void main(String[] args) {
		Person p = new Person("������");
		Exam e = new Exam();
		e.test1(p); 
		System.out.println(p.getName());//���ú��� ����! ������ WIN
		e.test2(p);
		System.out.println(p.getName()); //��ĭ
	}

}
