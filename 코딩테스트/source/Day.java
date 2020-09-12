package step1;

import java.time.LocalDate;
import java.util.Arrays;

public class Day {
	public static String a(int a, int b) {
		/*String answer[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		
		for(int i=0;i<a-1;i++) {
			sum+= month[i];
		}
		sum+=b;
		
		System.out.println(sum%7);*/
		
		
		/*
		 * 가독성 코드 
		 * LocalDate : 로컬 날짜 클래스로 날짜 정보만 필요할 때 사용
		 * of():LocalDate// 파라미터 주어진 날짜 정보를 저장 
		 * */
		String answer ="";
		LocalDate date = LocalDate.of(2016, 5, 24);
		answer=date.getDayOfWeek().toString().substring(0,3);
		return answer;
	}

	public static void main(String[] args) {
		String a = a(4, 22);
	
		
	}

}
