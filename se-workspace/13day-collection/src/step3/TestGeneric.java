package step3;

import java.util.ArrayList;

class Car {
	String name;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class TestGeneric {
	public static void main(String[] args) {
		// Generic Test
		ArrayList list2 = new ArrayList();
		list2.add("A");
		list2.add(1);
		// 첫번쨰 요소를 반환받을 때 Object down casting이 필요!
		String s = (String) list2.get(0);
		System.out.println(s.length());
		int a = (Integer) list2.get(1);
		System.out.println(list2.get(1));
		System.out.println(a);
		System.out.println(list2);
		
		/*
		 * Generic을 안했을떄
		 * */
		
		ArrayList list4 = new ArrayList<Car>();
		
		list4.add(new Car("소나타"));
		list4.add(new Car("소나타2"));
		list4.add(new Car("소나타3"));
		list4.add(new Car("소나타4"));
		

		
		// jdk 1.6 버전 이상에서는 Generic이 추가되어 객체 캐스팅 절차를 감소하고 타입의 안정성을 도모하도록 한다.
		//아래와 같이 Generic을 명시하기를 권장한다.
		
		
		ArrayList<Car> list3 = new ArrayList<Car>();
		
		list3.add(new Car("홍길동"));
		list3.add(new Car("소라카"));
		list3.add(new Car("소나"));
		list3.add(new Car("아트록스"));
		
		for(int i=0; i<list3.size(); i++) {
			System.out.println("이름 "+list3.get(i).getName());
		}
		
	}
}
