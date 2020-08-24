//피키지는 의미있는 디렉토리별로 클래스를 분류하기 위해 명시
package step1;
//클래스는 일반적으로 객체 생성을 위한 틀을 위해 정의한다.
public class Person {
//인스턴스 변수(Instance Variable) : 객체의 속성 정보를 저장, 자바 메모리 영역 중 Heap 영역(동적 메모리 영역)에 저장
//인스턴스 변수는 선언만 해도 자동 기본 초기화된다
	
	private String name; // 초기 값 String null
	
	public void eat() {
		int count =2; //Local Variable(지역 변수) : 메서드 내에 선언, 메서드 실행시에 일시적으로 사용된 후 메모리에서 해제
		System.out.println(count+"인분 먹다");
	}

	public String getName() {
		return name;
	}
//아래의 name은 지역변수이자 매개변수(parameter)로 불림
	public void setName(String name) {
//this.name : this는 현재 객체를 가르키므로 인스턴스 변수 name 지침
//name : 지역변수이자 매개변수를 가르킨다.
		this.name = name;
	}
	
	public void sleep() {
		/*지역변수 time이 초기화 되어 있지 않으므로 compile error
		int time;
		System.out.println(time);
		*/
		int time2=0;//이와 같이 명시적  초기화가 필요하다
		System.out.println(time2);
	}
	
	public void testVariable() {
		//인스턴스 변수 name에 접근해서 사용
		System.out.println(name);
		/*sleep()메서드 지역변수인 time2에 접근해본다
		 * System.out.print(time2) 로컬변수는 임시로 사용하므로 다른 메서드에서는 사용불가 compile error 
		 */
		sleep(); //한 메서드에서 다른 메서드 호출은 가능
	}
	

}
