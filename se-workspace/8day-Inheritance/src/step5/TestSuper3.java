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
		//super(); �����ε� ������ ��������� �⺻ �����ڰ� �ڵ����� ������ �ȵ�. ���� �⺻�����ڰ� �� ��������� ã�� ���� error
		super(age);
		this.name=name;
		
	}
}
public class TestSuper3 {

	public static void main(String[] args) {	
		Person p = new Person("ȫ�浿",123);
		System.out.println(p.name + p.age);
	}

}
