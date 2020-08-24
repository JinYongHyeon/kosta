package step2.method1;

public class Person {
	
	public void eat() {
		System.out.println("먹다");
	}
	
	//메서드를 호출한 측으로부터 데이터를 전달받기 위한 매개변수를 정의한 메서드를ㄹ 작성해 본다.
	public void eat2(String menu) {
		System.out.println(menu+"먹다");
	}
	
	public void eat3(String menu,int count) {
		System.out.println(menu+" "+count+"번 먹다");
	}
	
	public String eat4(String menu) {
		return menu+"~ 리턴";
	}
}
