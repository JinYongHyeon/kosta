package step1;

public class WorkoutClothes {
	public static int a(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		
		/**
		 * ���� ü������ ������ �л� �� ���������� ��� 1�� �˼� 
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
		 * 1�� �˼� �� ���� ü������ �����ϴ� ��� �ڱ� ��ȣ ��1�� �������� ����� ������ �ѻ������ ������ �� �ִ�.
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
