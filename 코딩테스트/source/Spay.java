package step1;

import java.util.HashMap;

public class Spay {
	public static int a(String[][] clothes) {
		int answer =1;
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0;i<clothes.length;i++) {
			//getOrDefault(key,defualt Value) : 찾는 키가 존재하면 해당 키의 value를 반환하고 , 없을 경우 기본값으로 반환
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
		}
		for(String key : map.keySet()) {
			answer*=map.get(key)+1;
		}
		return answer--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String b[][] = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		int num =a(a);
		System.out.println(num);
	}

}
