package step1;

import java.util.ArrayList;

public class Exam {
	public static int[] a(int[] answers) {
		int[] answer = {};
		int[] pattern1 = { 1, 2, 3, 4, 5 };// 5
		int[] pattern2 = { 2, 1, 2, 3, 2, 4, 2, 5 };// 8
		int[] pattern3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };// 10
		int[] clear = new int[3];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == pattern1[i % 5]) {
				clear[0]++;
			}
			if (answers[i] == pattern2[i % 8]) {
				clear[1]++;
			}
			if (answers[i] == pattern3[i % 10]) {
				clear[2]++;
			}
		}
		/**
		 * 가장 높은 점수 확인
		 */
		int max = clear[0]; 
		for(int i=1;i<clear.length;i++) {
			if(max<clear[i])
				max = clear[i];
		}
		/**
		 * 가장 많이 맞힌 사람 list 추가
		 */
		for(int i=0;i<clear.length;i++) {
			if(max == clear[i]) {
				list.add(i+1);
			}
		}
		/**
		 * 동점이 있을수 있어 사이즈로 배열 크기 지정 후 for loop을 통해 추가
		 */
		answer = new int[list.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = list.get(i);
		}
	
		return answer;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 4 };
		int aa[]  =a(a);
		for(int s : aa) {
			System.out.println(s);
		}
	}

}
