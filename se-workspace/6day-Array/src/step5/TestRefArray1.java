package step5;
/*
 * 참조형 데이터를 저장하는 배열
 */
public class TestRefArray1 {

	public static void main(String[] args) {
		Person[] p; //배열 선언
		p = new Person[3]; //배열 생성
		
		//배열 첫번쨰 방에 아이유 28객체를 저장
		 p[0] = new Person("오킹",28);
		 //배열 첫번째 요소의 Person 객체의 이름을 출력
		 System.out.println(p[0].getName());
		 p[1] = new Person("단장002",26);
		 p[2] = new Person("우정잉",27);
		 System.out.println("***배열 요소의 name을 모두 출력");
		 
		 for(int i=0;i<p.length;i++) {
			 System.out.println(p[i].getName());
		 }
		 System.out.println("***개선된 FOR문***");
		 for(Person p_name : p) {
			 System.out.println(p_name.getName());
		 }
	}

}
