package step7;

public class TestFor5 {

	public static void main(String[] args) {
		
	
		//구구단 2단부터 9단까지 출력하는 예제
		//중첩 for문을 이용한다.
		for(int i=2; i<=9;i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
