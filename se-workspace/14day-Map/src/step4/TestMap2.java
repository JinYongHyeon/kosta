package step4;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap2 {	
	String name;
	public static void main(String[] args) {
		//순서를 기억
		LinkedHashMap<String,Product> map = new LinkedHashMap<String, Product>();
		Product p = new Product("1", "Map", "Apple", 1500);
		Product p3 = new Product("4", "Map", "Apple", 1500);
		Product p2 = new Product("2", "Galary", "Samsung", 1400);
		map.put(p.getId(), p);
		map.put(p2.getId(), p2);
		map.put(p3.getId(),p3);
		System.out.println("요게뭐지??????"+map.entrySet());
		System.out.println(map);
		
		//상품아이디가 2인 상품의 name을 출력 - 클라우드
		
		System.out.println(map.get("2").getName());
		
		//현재 map의 key들만 열거, 출력해본다.
		Set<String> s = map.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext())System.out.println(it.next()+"\t");
		
		//현재 map의 value들만 출력해본다
		Collection<Product> co = map.values();
		Iterator<Product> it2 = co.iterator();
		while(it2.hasNext())System.out.println(it2.next()+"\t");
		//service insert(Person) map.put(p.getId(),p); select 
		System.out.println(new TestMap2().name);
	}
}
