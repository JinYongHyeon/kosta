package dddddd;

public class Testasd123 {
	public int solution(int n) {
		int answer = 0;

		while (true) {
		
			answer += n % 10;
			n = n / 10;
			if (n==0)
				break;
		}

		return answer;
	}

	public static void main(String arsg[]) {

			int a = new Testasd123().solution(12345);
			System.out.println(a);

	}
}