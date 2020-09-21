package step1;

import java.util.Arrays;
import java.util.Comparator;

public class TextOrder {

	/*
	 * Comparator : 익명 클래스 , 람다식 방법으로 만들 수 있다. / 객체 간의 특정한 정렬이 필요할 떄, Comparator
	 * 인터페이스를 확장해서 특정 기준을 정의하는 compare()메서드를 구현한다.
	 */
	/*
	 * Comparable : 객체 간의 일반적인 정렬 이 필요할 때, Comparable 인터페이스를 확장해서 정렬의 기준을 정의하는
	 * compareTo()메서드를 구현
	 */

	public String[] a(String[] strings, int n) {
		// 익명클래스 방법
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				System.out.print("s1: "+s1);
				System.out.println(" / s2: "+s2 );
				// 리턴 값은 음수,양수,0이 될 수 있습니다. 음수가 리턴되면 오른쪽 인자가 아래로 내려간다.(내림차순) / 양수 오름차순 / 0변환없음
				char c1 = s1.charAt(n);
				char c2 = s2.charAt(n);
				if (c1 == c2) {
					return s1.compareTo(s2);
				}
				return c1-c2;
			}

		});

		// 람다식 방법
		// Collections.sort(strings,(s1,s2) -> s1.length - s2.length());

		return strings;
	}

	public static void main(String[] args) {
		String[] arr = { "car", "usb","cit","abc","tig"};
		int n = 1;
		String arr2[] = new TextOrder().a(arr, n);
		//for(String s : arr2)System.out.println(s);
	}

}
