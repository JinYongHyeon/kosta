package step4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap2 {	
	String name;
	public static void main(String[] args) {
		//������ ���
		LinkedHashMap<String,Product> map = new LinkedHashMap<String, Product>();
		Product p = new Product("1", "Map", "Apple", 1500);
		Product p3 = new Product("4", "Map", "Apple", 1500);
		Product p2 = new Product("2", "Galary", "Samsung", 1400);
		map.put(p.getId(), p);
		map.put(p2.getId(), p2);
		map.put(p3.getId(),p3);
		System.out.println("��Թ���??????"+map.entrySet());
		System.out.println(map);
		
		//��ǰ���̵� 2�� ��ǰ�� name�� ��� - Ŭ����
		
		System.out.println(map.get("2").getName());
		
		//���� map�� key�鸸 ����, ����غ���.
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext())System.out.println(it.next()+"\t");
		
		//���� map�� value�鸸 ����غ���
		Collection<Product> co = map.values();
		Iterator<Product> it2 = co.iterator();
		while(it2.hasNext())System.out.println(it2.next()+"\t");
		//service insert(Person) map.put(p.getId(),p); select 
		System.out.println(new TestMap2().name);
	}
}
