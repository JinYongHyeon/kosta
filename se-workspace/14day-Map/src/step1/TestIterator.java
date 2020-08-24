package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Iterator interface : �ݺ� ���� ǥ�� �������̽�
 */
public class TestIterator {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("ȣ����");
		c1.add("��ٴϿ�");
		Iterator<String> it = c1.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());;
		}
		
		System.out.println("************************");
		Collection<String> c2= new LinkedHashSet<String>();
		c2.add("ũ����");
		c2.add("��׽�");
		c2.add("��׽�");
		//c2�� �ִ� ��ҵ��� Iterator ������� �ݺ� �����غ���
		Iterator<String> it2= c2.iterator();
		System.out.println(it2);
		System.out.println(c2.iterator());
		while(it2.hasNext()) {
			System.out.println(it2.next());
		//���� ���� Set �迭 ����ü (LinkedHashSet)�̵� �ƴϸ� List �迭  ����ü�̵� ������� Collection Interface�� �����̹Ƿ� ���� ���(Iterator interface)
		//���� �ݺ� ���� ����
		}
	}

}
