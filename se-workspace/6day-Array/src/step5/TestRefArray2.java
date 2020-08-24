package step5;

public class TestRefArray2 {
	public static void main(String[] args) {
		// 배열 선언 생성 할당 동시에
		Person p[] = { new Person("이순신", 33), new Person("홍길동", 32), new Person("일지매", 34) };
		System.out.println(p.length);

		System.out.println("***배열 요소의 name과 age를 출력***");

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName() + " " + p[i].getAge());
		}

		System.out.println("개선된  FOR문");
		for (Person person : p) {
			System.out.println(person.getName() + " " + person.getAge());
		}
		
		System.out.println("***배열 요소 나이를 20을 더한다***");
		for (int i = 0; i < p.length; i++) {
			p[i].setAge(p[i].getAge()+20);
			System.out.println(p[i].getName() + " " + p[i].getAge());
		}
	}
}
