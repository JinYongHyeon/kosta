	package step2;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	//Set 계열이므로 중복은 허용하지 않고 입력순서를 기억한다.
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("짜장면");
		set.add("라면");
		set.add("짬뽕");
		set.add("비빔면");
		set.add("쫄면");
		set.add("스파게티");
		set.add("파스타");
		set.add("라면");
		
		System.out.println(set);
	}

}
