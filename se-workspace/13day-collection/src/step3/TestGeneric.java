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
		// ù���� ��Ҹ� ��ȯ���� �� Object down casting�� �ʿ�!
		String s = (String) list2.get(0);
		System.out.println(s.length());
		int a = (Integer) list2.get(1);
		System.out.println(list2.get(1));
		System.out.println(a);
		System.out.println(list2);
		
		/*
		 * Generic�� ��������
		 * */
		
		ArrayList list4 = new ArrayList<Car>();
		
		list4.add(new Car("�ҳ�Ÿ"));
		list4.add(new Car("�ҳ�Ÿ2"));
		list4.add(new Car("�ҳ�Ÿ3"));
		list4.add(new Car("�ҳ�Ÿ4"));
		

		
		// jdk 1.6 ���� �̻󿡼��� Generic�� �߰��Ǿ� ��ü ĳ���� ������ �����ϰ� Ÿ���� �������� �����ϵ��� �Ѵ�.
		//�Ʒ��� ���� Generic�� ����ϱ⸦ �����Ѵ�.
		
		
		ArrayList<Car> list3 = new ArrayList<Car>();
		
		list3.add(new Car("ȫ�浿"));
		list3.add(new Car("�Ҷ�ī"));
		list3.add(new Car("�ҳ�"));
		list3.add(new Car("��Ʈ�Ͻ�"));
		
		for(int i=0; i<list3.size(); i++) {
			System.out.println("�̸� "+list3.get(i).getName());
		}
		
	}
}
