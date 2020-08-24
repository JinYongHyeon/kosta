package step2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DataService {
	/**
	 * type A������ TreeSet�� ��ȯ
	 * type B������ ArrayList�� ��ȯ
	 * �پ��� �ڷᱸ��ü�� ��ȯ������ Collection �������̽��� ���� ����ü�̹Ƿ� Collection Ÿ������ ��ȯ�Ѵ�.
	 * @param type
	 * @return
	 */
	public Collection searchData(String type) {
		Collection<String> collection = null;
		if(type.equals("A")) {
			collection = new TreeSet<String>();
			collection.add("¥���");
			collection.add("«��");
		}else if(type.equals("B")) {
			collection = new ArrayList<String>();
			collection.add("���ø�");
			collection.add("����ø�");
		}
		return collection;
	}
}