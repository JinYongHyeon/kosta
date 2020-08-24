package step1;

class Animal {
	private int age = 1;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		 this.age = age;
	}
}

/*Person(sub class) 은 Animal(super calss)을 상속받는다.
extends : 확장하다
*/
class Person extends Animal {
	public void study() {
		System.out.println(getAge()+"살이 공부하다.");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		Person p = new Person(); // 자식 객체를 생성
		/*
		 * compile error : 이유는 age변수는 private접근 제어자로 선언되어있고 private은 자신의 클래스 내에서만 접근가능
		 * 상속받았어도 클래스가 다르므로 직접 접근 불가
		 */
//		System.out.println(p.age);
		//부모의 private변수를 setter/getter로 간접접근하면 된다.
		System.out.println(p.getAge());
	}

}
