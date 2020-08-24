package step1;

//아래와 같이 별도의 상속관계 표현이 없을 시 자동으로 Object 상속을한다. Object == root == 최상위 클래스
class Parent {
	Parent() {
		super();
		System.out.println("Parent객체 생성"); // 객체 == 인스턴스
	}
}

class Child extends Parent {
	public Child() {
		super();
		System.out.println("Child객체 생성");
	}

	@Override
	public String toString() {
		return "안농";
	}
}

class Car{ // 별도의 상속관계 표현이 없을 시 자동으로 extends Object 상속을한다.
	
	public void star() {
		
		for(int i=0; i<5; i++) { // 지역변수로만 가능?
			
		}
	}
}

public class TestObjectClass {	
	

	public static void main(String[] args) {
	
			
			Child c = new Child();
			System.out.println(c);
			/*
			 * Child는 별도의 메서드가 정의되어 있지 않지만 상속받은 Parent가 extends Object 하고 있어서 Object class의 getClass()를 자신의 기능으로 사용가능
 			 */
			System.out.println(c.getClass());
			
			Car car = new Car();
			//Object 자식이므로 Object class의 getClass()를 사용 할 수 있다.
			System.out.println(car.getClass()+"@"+car.hashCode());
	}
}
