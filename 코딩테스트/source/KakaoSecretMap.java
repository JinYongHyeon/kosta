package step1;

import java.util.ArrayList;
import java.util.HashMap;

public class KakaoSecretMap {

	public static HashMap<Integer,String> b(int n,int[] arr){
		int index = 0;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		/**
		 * ArrayList = arr1 arr2 값 HashMap : 2진수 변환 된 값 저장될 방 만들기
		 */
		for (int i = 0; i < n; i++) {
			list.add(arr[i]);
			map.put(i, null);
		}
		/**
		 * StringBuilder을 이용하여 값을 담고 for loop을 통해 반복문을 돌리고 그 안에 while문을 돌려 10진수 2로 나머지 값
		 * StringBuilder 추가하고 10진수 값이 2로 나눌때1 보다 작거나 같을경우 10진수 값 StringBuilder에 추가 후
		 * while문을 빠져 나온다.
		 *
		 * StringBuilder 길이가 n보다 작을경우 0 추가
		 */
		for (int num : list) {
			StringBuilder sb = new StringBuilder();
			int h = num;
			while (true) {
				sb.append(h % 2);
				h = h / 2;
				if (h <= 1) {
					sb.append(h);
					break;
				}

			}
			while (sb.length() < n) {
				sb.append("0");
			}
			map.put(index++, sb.toString());
		}
		return map;
	}

	public static String[] a(int n, int[] arr1, int[] arr2) {
		String[] answer = {};

		String good[] = new String[n];
		HashMap<Integer,String> map = b(n,arr1);
		HashMap<Integer,String> map2 = b(n,arr2);

		for (int j=0;j<map.size();j++) {
			String name = map.get(j);
			StringBuilder sb= new StringBuilder();
			for (int i = 0; i < map.get(j).length(); i++) {

				if(!map.get(j).substring(i, i+1).contentEquals(map2.get(j).substring(i,i+1))) {
					sb.append("#");
				}else if(name.substring(i,i+1).equals("1")) {
					sb.append("#");
				}else {
					sb.append(" ");
				}

			}
			good[j] =sb.reverse().toString();
		}
		answer = new String[good.length];
		for(int i=0;i<answer.length;i++) {
			answer[i] = good[i];
		}


		return answer;
	}

	public static  String[] c(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		/*
		   StringFormat형식  = %[argument_index$][flags][width]conversion
		   % , conversion(s[문자열], d[정수], x[16진수], o[8진수], f[실수]) 필수

		       진수변환 함수
		   Integer.toBinaryString(int) : String //2진수
		   Integer.toOctalString(int) : String //8진수
	       Integer.toHexString(int) : String //16진수

	       replace(target , replacement) : String //특정문자 변경
		*/
		for(int i=0;i<n;i++) {
			answer[i] = String.format("%"+n+"s", Integer.toBinaryString(arr1[i] | arr2[i])); // 비트 연산자 2진수 or 비교
			answer[i] = answer[i].replace("1", "#");
			answer[i] = answer[i].replace("0", " ");
		}
		System.out.println(answer.length);
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };
		String answer[] = c(n, arr1, arr2);
		for(String ab : answer)
		System.out.println(ab);
		// 출력 결과 : ##### , # # #, ### #, # ##, #####
	}

}
