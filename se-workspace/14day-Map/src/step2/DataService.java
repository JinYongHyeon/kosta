package step2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DataService {
	/**
	 * type A유형은 TreeSet이 반환
	 * type B유형은 ArrayList가 반환
	 * 다양한 자료구조체가 반환되지만 Collection 인터페이스의 하위 구현체이므로 Collection 타입으로 반환한다.
	 * @param type
	 * @return
	 */
	public Collection searchData(String type) {
		Collection<String> collection = null;
		if(type.equals("A")) {
			collection = new TreeSet<String>();
			collection.add("짜장면");
			collection.add("짬뽕");
		}else if(type.equals("B")) {
			collection = new ArrayList<String>();
			collection.add("물냉면");
			collection.add("비빔냉면");
		}
		return collection;
	}
}
