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

		map.put("a", new Person("������", "����"));
		map.put("b", new Person("�տ���", "����2"));
		map.put("c", new Person("ȫ�浿", "����3"));
		System.out.println(map.size());
		;
		System.out.println(map);

		Person p = map.get("a");
		System.out.println(p);
		System.out.println(map.get("D"));// �������� �ʴ� key�� ��ȸ�ϸ� null
		// ���� key�� �߰��� ���
		map.put("b", new Person("�ſ���", "����4"));
		System.out.println(map.get("b"));
		System.out.println(map.containsKey("a")); //true false ��ȯ
		System.out.println(map.containsKey("d"));
		p = map.remove("b");
		System.out.println("������ ���� : "+p);
		System.out.println(map.get("b"));
		System.out.println(map.values());
		System.out.println(map.keySet());	
		map.clear();
		System.out.println(map);
	}

}
