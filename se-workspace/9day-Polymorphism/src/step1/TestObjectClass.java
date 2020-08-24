package step1;

//�Ʒ��� ���� ������ ��Ӱ��� ǥ���� ���� �� �ڵ����� Object ������Ѵ�. Object == root == �ֻ��� Ŭ����
class Parent {
	Parent() {
		super();
		System.out.println("Parent��ü ����"); // ��ü == �ν��Ͻ�
	}
}

class Child extends Parent {
	public Child() {
		super();
		System.out.println("Child��ü ����");
	}

	@Override
	public String toString() {
		return "�ȳ�";
	}
}

class Car{ // ������ ��Ӱ��� ǥ���� ���� �� �ڵ����� extends Object ������Ѵ�.
	
	public void star() {
		
		for(int i=0; i<5; i++) { // ���������θ� ����?
			
		}
	}
}

public class TestObjectClass {	
	

	public static void main(String[] args) {
	
			
			Child c = new Child();
			System.out.println(c);
			/*
			 * Child�� ������ �޼��尡 ���ǵǾ� ���� ������ ��ӹ��� Parent�� extends Object �ϰ� �־ Object class�� getClass()�� �ڽ��� ������� ��밡��
 			 */
			System.out.println(c.getClass());
			
			Car car = new Car();
			//Object �ڽ��̹Ƿ� Object class�� getClass()�� ��� �� �� �ִ�.
			System.out.println(car.getClass()+"@"+car.hashCode());
	}
}
