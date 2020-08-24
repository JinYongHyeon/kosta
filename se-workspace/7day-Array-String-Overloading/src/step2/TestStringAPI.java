package step2;

/*
 * java.lang 패키지는 기본으로 사용할 수 있는 패키지다.
 * java.lang.String class의 메서드를 사용해 보는 예제
 */
public class TestStringAPI {

	public static void main(String[] args) {
		String str = "홍길동,일지매,루시안,쓰레쉬";
		System.out.println(str);
		// 위 문자열을,를 기준으로 구분해서 배열로 관리하고 싶다면 String class에서 제공하는 split()을 사용하면 된다.
		String[] array = str.split(",");
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		String name1 = "김유정";
		// name1이 몇개의 문자로 구성
		System.out.println(name1.length());
		// 김으로 시작되는 문자열인지 여부 확인 true, false
		System.out.println(name1.startsWith("김"));
		System.out.println(name1.startsWith("강"));
		System.out.println(name1.startsWith("백"));
		System.out.println("**자바 문자열 비교**");
		String angel="아이유";
		String angel2="박신혜";
		System.out.println(angel == angel2);
		String angel3=new String("아이유");
		System.out.println(angel3);
		//같은 아이유 문자열이지만 만드는 방식에 따라 아래 == 연산자는 문자열 비교에 적합하지 않다. 예상한 결과 true가 반환되지 않는다.
		System.out.println(angel == angel3);
		//자바 문자열 비교시에는 반드시 String에서 제공하는 equals() 메소드를 이용해야 한다.
		System.out.println(angel.equals(angel3));
	}

}
