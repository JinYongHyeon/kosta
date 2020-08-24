package step6;

public class TestExam {

	public static void main(String[] args) {
		// int형 최대값
		// System.out.println(Integer.MAX_VALUE);
		// int형 최소값
		// System.out.println(Integer.MIN_VALUE);

		int[] point = { 30, 50, 10, 20, 100 };
		// point 배열 요소의 최소값을 찾아 출력해본다

		int minPoint = Integer.MAX_VALUE;
		int maxPoint = Integer.MIN_VALUE;
		
		for (int i = 0; i < point.length; i++) {
			if (minPoint>point[i]) {
				System.out.println(point[i]);
				minPoint = point[i];
			}else if(maxPoint<point[i]) {
				System.out.println("max"+maxPoint);
				maxPoint = point[i];
			}
		
		}
		System.out.println("최소 point : " + minPoint);
		System.out.println("최대 point : " + maxPoint);

	}
}
