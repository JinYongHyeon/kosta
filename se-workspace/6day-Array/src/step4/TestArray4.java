package step4;

public class TestArray4 {

	public static void main(String[] args) {
		int price[] = {7000,4500,5000,12000};
		//price 배열 요소를 모두 출력하되 10000 미만만 출력한다
		
		
		for(int i=0; i<price.length; i++) {
			if(price[i]<10000) {
				System.out.println(price[i]);
			}
		}
		
		/*
		 * 개선된 for문
		 */
		System.out.println("***개선된 FOR문***");
		for(int money : price) {
			if(money<10000) {
				System.out.println(money);
			}
		}
		
	}

}
