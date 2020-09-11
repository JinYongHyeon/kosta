package step1;

public class WorkoutClothes {
	public static int a(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		/**
		 * 여벌 체육복을 가져온 학생 중 도난당했을 경우 1차 검수 
		 */
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
					break;
				}
			}
		}
		/**
		 * 1차 검수 후 여벌 체육복이 존재하는 사람 자기 번호 ±1로 도난당한 사람이 있으면 한사람에게 빌려줄 수 있다.
		 */
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int lost[] = { 2,4 };
		int reserve[] = { 1,3,5 };
		int b = a(n, lost, reserve);
		System.out.println(b);
	}

}
