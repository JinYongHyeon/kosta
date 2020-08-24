package step4;

public class TestArray1 {

	public static void main(String[] args) {
		int age[]; // 배열 선언 int[] age
		age = new int[3]; // 배열 객체 생성
		age[0] = 10; // 배열 첫번째 방에 10을 저장
		age[1] = 14;
		age[2] = 20;
		System.out.println(age.length); //배열 길이
		/*
		 * for (int i = 0; i < age.length; i++) { System.out.println(age[i]); }
		 */
		
		/*
		 * 개선된 for문 
		 */
		for(int i : age) {
			System.out.println(i);
		}
	}

}
