package step7;

public class TestReferenceDataType {

	public static void main(String[] args) {
		/*
		 * Person : 참조형 데이터 타입
		 * p : 참조변수 reference variable (객체를 참조하는 주소값을 저장)
		 * 
		 */
		Person p = new Person("홍길동");
		System.out.println(p.getName());
		
		Person p2 = new Person("손오공");
		System.out.println(p2.getName());
		p=p2;
		System.out.println(p.getName());
		System.out.println(p2.getName());
		

	}
}
