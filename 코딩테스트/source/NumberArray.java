package step1;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberArray {
	public int[] a(int[] arr, int divisor) {
		int[] answer = {};
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		if (list.size() > 0) {
			answer = new int[list.size()];
			for (int j = 0; j < answer.length; j++) {
				answer[j] = list.get(j);
			}
		}else {
			answer= new int[]{-1};
		}
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 3,2,6 };
		int divisor = 10;
		new NumberArray().a(arr, divisor);
	}

}
