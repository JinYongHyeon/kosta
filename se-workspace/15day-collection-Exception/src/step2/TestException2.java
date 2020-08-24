package step2;

import java.util.ArrayList;

public class TestException2 {
		
	public void a() throws NullPointerException {
		System.out.println("a호출");
		String name =null;
		System.out.println(name.length());
	}
	
	public void b() {
		try {
		a();
		System.out.println("b호출");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("나 호출됨?");
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * 출금작업단위(트랜잭션)
		 * try{
		 * 1. 카드 삽입
		 * 2. 작업선택
		 * 3. 금액입력
		 * 4. 출금
		 * }catch(카드 오류){
		 * }catch(금액오류){
		 * }
		 */
		
		//하나의 try블럭 안에 다양한 예외가 발생하지 있으므로 여러개의 catch 구문이 가능하다
		ArrayList<String> list = new ArrayList<String>();
		String name="홍길동";
		name = null;
		try {
			System.out.println(list.get(1));
			System.out.println();
			System.out.println(name.length());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("이름이 존재하지 않습니다.");
		}catch(Exception e2){
			e2.printStackTrace();
			System.out.println("값 없다 아이가 돌아가라");
		}
		System.out.println("프로그램 정상 수행");
		
		System.out.println("***********************");
		new TestException2().b();
	}

}
