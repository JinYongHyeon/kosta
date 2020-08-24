package step2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//<String> -> Generic(종류) , Set에 추가될 요소의 타입을 명시하는 것을 권장한다.
		TreeSet<String> set = new TreeSet<String>();
		ArrayList list = new ArrayList<String>();
		set.add("홍길동");
		set.add("자크");
		set.add("우르곳");
		set.add("홍길동"); //중복은 인정하지 않음
		set.add("홍길동"); //중복은 인정하지 않음
		
		System.out.println(set.size()); //3 중복을 제오하고 사이즈 체크
		//TreeSet의 특징은 정렬기능이 내장되어 있다.
		System.out.println(set);
		
		Iterator<String> i = set.iterator();
		for(int i2=0; i2<set.size();i2++) {
			System.out.println(i.next());
		}
		

		
	}

}
