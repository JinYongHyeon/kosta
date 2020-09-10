package step1;


import java.util.Arrays;
import java.util.LinkedHashSet;

public class TelPhone {
	public static boolean a(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		for(int i=0;i<phone_book.length-1;i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String a[] = { "119", "97674223", "1195524421" };
		String b[] = { "123", "12", "1235", "567", "88" };
		String test = "abc";
		System.out.println(test.substring(2));
		boolean flag = a(b);
		System.out.println(flag);
	}

}
