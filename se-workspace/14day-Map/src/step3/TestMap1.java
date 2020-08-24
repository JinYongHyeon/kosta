package step3;

import java.util.HashMap;

class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address;
	}

}

public class TestMap1 {

	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<String, Person>();

		map.put("a", new Person("진용현", "용인"));
		map.put("b", new Person("손오공", "용인2"));
		map.put("c", new Person("홍길동", "용인3"));
		System.out.println(map.size());
		;
		System.out.println(map);

		Person p = map.get("a");
		System.out.println(p);
		System.out.println(map.get("D"));// 존재하지 않는 key로 조회하면 null
		// 같은 key로 추가할 경우
		map.put("b", new Person("신용재", "용인4"));
		System.out.println(map.get("b"));
		System.out.println(map.containsKey("a")); //true false 반환
		System.out.println(map.containsKey("d"));
		p = map.remove("b");
		System.out.println("삭제한 정보 : "+p);
		System.out.println(map.get("b"));
		System.out.println(map.values());
		System.out.println(map.keySet());	
		map.clear();
		System.out.println(map);
	}

}
