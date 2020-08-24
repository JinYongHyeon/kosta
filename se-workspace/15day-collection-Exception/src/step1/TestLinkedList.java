package step1;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new  LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.size()); //LinkedList 배열 크기 
		System.out.println(list.get(1));
		//특정위치에 추가
		list.add(1,"d");
		System.out.println(list);
		
		//삽입
		list.addFirst("k");
		System.out.println(list);
		list.addLast("t");
		System.out.println(list);
		
		ArrayList <String> list2 = new ArrayList<String>();
		
		list2.add("asd");
		list2.add("asd");
		list2.add("asd");
		list2.add("2222");
		list2.add("asd");
		list2.add("asd");	list2.add("asd");
		
		System.out.println(list2);

		
		list2.remove(3);
		
		System.out.println(list2.size());
		
		
		
	}

}
