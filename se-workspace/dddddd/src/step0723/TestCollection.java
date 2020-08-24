package step0723;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Animal {
	@Override
	public String toString() {
		return "1Â¯";
	}
}

class Animal2 extends Animal {
	@Override
	public String toString() {
		return "2Â¯";
	}
}

class Animal3 extends Animal {
	@Override
	public String toString() {
		return "3Â¯";
	}
}

public class TestCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int a = 0;
		list.add(3);
		list.add(2);
		list.add(1);
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println("set");
		System.out.println(s);
		System.out.println(s.iterator().next());
		System.out.println(s.iterator().next()+1);
		System.out.println(s.iterator().next());
		
		System.out.println(list);
		List<Animal> list2 = new ArrayList<Animal>();

		list2.add(new Animal2());
		list2.add(new Animal3());
		
		System.out.println(list.iterator().equals(new Animal())+"asds");

		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.containsAll(list));

		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i) instanceof Animal2) {
				System.out.println("¸ÂÀ½");
			} else {
				System.out.println("¾Æ´Ô");
			}
		}
		List<Object> list3 = new ArrayList<>();
		
		
		list3.add(1);
		list3.add(2);
		list3.add(2);
		list3.add(3);
		list3.add("b");
		list3.add("a");
		
		System.out.println(list3);
		list3.retainAll(list);
		System.out.println(list3);
		
	
	}
}
