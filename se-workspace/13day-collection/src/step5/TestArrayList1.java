package step5;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("전우치");
		list.add("전우치");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.set(2, "손오공"); //수정
		System.out.println(list);
		String name = list.remove(1);
		System.out.println(name +" 요소를 삭제");
		System.out.println(list);
	}

}
