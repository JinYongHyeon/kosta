package step4;

public class TestArray3 {

	public static void main(String[] args) {
		//�迭 ����, ����, �Ҵ� ���ÿ�
		int[] point = {200,300,700,100,400};
		
		for(int i=0; i<point.length; i++) {
			System.out.println(point[i]);
		}
		System.out.println("������ for��");
		for(int loop : point) {
			System.out.println(loop);
		}
			
		System.out.println("point ����� ���");
		int sum =0;
		int avg= 0;
		for(int loop : point) {
			sum += loop;
		}
		avg = sum/point.length;
		
		System.out.println(avg);
	}

}
