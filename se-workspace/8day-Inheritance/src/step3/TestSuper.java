package step3;

class Animal{
	Animal(){System.out.println("ani2");}
	Animal(int i){System.out.println("ani232323");}
	public void eat() {
		System.out.println("�Դ�");
	}
	
}
class Person extends Animal{
	//������ constructor
	public Person() {
		//super()�� �θ� �����ڸ� �����ؼ� �θ� ��ü �����ϴ� ����
		System.out.println("hi");
	}
	public Person(int i) {
		
	}
}

public class TestSuper {

	public static void main(String[] args) {
			new Person(); //��ü ����(�����ڰ� ����)
			new Person(1);
	}

}
