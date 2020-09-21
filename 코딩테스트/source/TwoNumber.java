package step1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TwoNumber {
	public int[] a(int[] numbers) {
		int[] answer = {};
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				list.add(numbers[i] + numbers[j]);
			}
		}
		System.out.println(list);
		answer = new int[list.size()];
		int index = 0;
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			answer[index++] = (int) iterator.next();
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		int arr[] = new TwoNumber().a(new int[] { 5, 0, 2, 7 });
		for (int num : arr) {
			System.out.println(num);
		}
	}

}
