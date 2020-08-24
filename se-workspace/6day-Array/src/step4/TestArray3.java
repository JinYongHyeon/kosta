package step4;

public class TestArray3 {

	public static void main(String[] args) {
		//배열 선언, 생성, 할당 동시에
		int[] point = {200,300,700,100,400};
		
		for(int i=0; i<point.length; i++) {
			System.out.println(point[i]);
		}
		System.out.println("개선된 for문");
		for(int loop : point) {
			System.out.println(loop);
		}
			
		System.out.println("point 평균을 출력");
		int sum =0;
		int avg= 0;
		for(int loop : point) {
			sum += loop;
		}
		avg = sum/point.length;
		
		System.out.println(avg);
	}

}
