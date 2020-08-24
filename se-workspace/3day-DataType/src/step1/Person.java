package step1;

public class Person {
/*
 *  Encapsulation 적용클래스
 *  외부에 공개하지 않을 부분은 private 
 *  외부에 공개 할 부분은 public
 */

	private String name;
	private int age;
	
	//getter 외부에서 정보를 반환받기 위한 메서드
	public String getName() {
		return name;
	}
		//setter는 외부에서 정보를 할당받기 위한 메서드
	public void setName(String name) {
		//this예약어(keyword)는 인스턴스 변수를 가르키기 위하여 사용한다
		//this를 이용해 인스턴스변수와 매개변수를 구분한다.
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	/*
	 * 매개변수 age의 전달된 값이 1 미만일 경우 잘못된 나이이므로 할다할 수 없습니다.
	 * 1이상이면 객체의 인스턴스 변수 age에 할당한다.
	 */
	public void setAge(int age) {
		if(age>0) {
		this.age= age;
		}else {
			System.out.println("나이를 다시 입력해주십시오.");
		}
	}

}
