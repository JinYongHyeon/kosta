package step5;

class Animal {
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal {

	@Override
	public void eat() {
		System.out.println("����� �Դ�");
	}
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("�������� �Դ�");
	}

}

class ZooService{
	public void pass(Animal[] a) {
		System.out.println("*******������ for��********");
		for(Animal b : a) {
			b.eat();
		}
		System.out.println("***************");
		for(int j=0; j<a.length;j++) {
			a[j].eat();
		}
	}
			
}

public class TestPolymorphismArray2 {

	public static void main(String[] args) {
		
		 /* for���� �̿��� �Ʒ��� ���� ����ϼ���
		 * �Դ�
		 * ����� �Դ�
		 * ���� �Դ�
		 */
		
		Animal[] a = { new Animal(), new Person(), new Dog() };
		for(int i=0; i<a.length;i++) {
			a[i].eat();
		}
		ZooService service = new ZooService();
		service.pass(a);
	}

}
