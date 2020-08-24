package step5;

class Animal {
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal {

	@Override
	public void eat() {
		System.out.println("사람이 먹다");
	}
}

class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("강아지가 먹다");
	}

}

class ZooService{
	public void pass(Animal[] a) {
		System.out.println("*******개선된 for문********");
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
		
		 /* for문을 이용해 아래와 같이 출력하세요
		 * 먹다
		 * 사람이 먹다
		 * 개가 먹다
		 */
		
		Animal[] a = { new Animal(), new Person(), new Dog() };
		for(int i=0; i<a.length;i++) {
			a[i].eat();
		}
		ZooService service = new ZooService();
		service.pass(a);
	}

}
