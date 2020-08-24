package programmers;

public class Solution3 {
	/*public int[] asd(int[][] a) {

		int[] answer = {};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
		}

		return answer;
	}*/

	public void array(int[] num) {
		int point =1;
		int point2=0;
		int aw[] = new int[num.length];
		for (int i = 0; i < aw.length; i++) {
			for (int j = 0; j < num.length; j++) {
		
				//System.out.print(num[j]+"\t");
				if(point == num[j]) {
					
					aw[i] = ++point2;
				}else {
					point2=0;
				}
			}

		}
		System.out.println(aw[0]);
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		//s.asd(new int[][] { { 1, 4, 3, 4, 3, 10 } });

		s.array(new int[] { 1, 1, 1, 2, 3, 4, 5 });

	}

}
