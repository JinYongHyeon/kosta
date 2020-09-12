package step2;

import java.util.regex.Pattern;
/* 
  								=====조건=====
    1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
	2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
	3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
	4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
	5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
	6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     	만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
	7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	
 */
public class KakaoBlandSingup {
	public static String b(String new_id) {
			
		Pattern pattern = Pattern.compile("(\\.)\\1{1,}");
		new_id = pattern.matcher(new_id).replaceAll("$1");
		System.out.println("3단계 : "+new_id);
		return new_id;
	}

	public static String c(String new_id) {
		if (new_id.length() == 1 && new_id.contentEquals(".")) {
			new_id = "";
		} else if (new_id.startsWith(".") && new_id.endsWith(".")) {
			new_id = new_id.substring(1, new_id.length() - 1);
		} else if (new_id.startsWith(".")) {
			new_id = new_id.substring(1);
		} else if (new_id.endsWith(".")) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}

		System.out.println("4단계 : " + new_id);

		return new_id;

	}

	public static String a(String new_id) {
		String answer = "";

		// 1단계 toLowerCase()[소문자로 변환]
		new_id = new_id.toLowerCase();
		System.out.println("1단계  : " + new_id);

		// ^y : y를 제외한 모든 것
		// 2단계 소문자, 숫자, 빼기, 밑줄, 마침표 제외 제거
		new_id = new_id.replaceAll("[^a-z0-9-._\\-]", "");
		System.out.println("2단계 : " + new_id);

		// 3단계 마침표(.)2번 이상 연속된 부분을 하나의 마침표로 치환
		new_id = b(new_id);

		// 4단계 처음과 끝 마침표(.) 존재시 제거
		new_id = c(new_id);
		// 5단계 빈 문자열이라면 a 대입
		if (new_id.trim().contentEquals("") || new_id == null) {
			new_id = "a";
		}
		System.out.println("5단계 : " + new_id);

		// 6단계 16자 이상이면 처음 15자를 제외한 나머지 제거
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			if (new_id.endsWith(".")) {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}
		System.out.println("6단계 : " + new_id);

		// 7단계 문자 길이가 2자 이하면 마지막 문자 길이가 3될때까지 반복 붙여넣기
		while (new_id.length() < 3) {
			new_id += new_id.substring(new_id.length() - 1, new_id.length());
		}
		System.out.println("7단계 : " + new_id);


		answer = new_id;
		return answer.trim();
	}

	public static void main(String[] args) {
		String test = "A-B23.-.S..D.C..@!..#.?...        d.DDDDDDn.../;ASD.";
		String test2 = "...!@BaT#*..y.abcdef        sddd    sghijklm";
		String test3 = "123_.def";
		String test4 = "abcd......efg.....hij.....lm.d..p";
		String test5 = "\"z-+.^.\"";
		String test6 = "=.=";
		System.out.println("최종 : " + a(test4));
	}

}
