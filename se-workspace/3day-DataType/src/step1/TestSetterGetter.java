package step1;

/*
 * Encapsulation 적용된 클래스를 테스트 하는 예제
 * setter/getter를 활용해본다
 */

public class TestSetterGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();

		p.setName("오킹");
		System.out.println(p.getName());

		System.out.println("******************************************");

		p.setAge(-28);	
		p.setAge(28);
		System.out.println(p.getAge() + "세");

	}

}
