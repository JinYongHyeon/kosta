package step2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//<String> -> Generic(����) , Set�� �߰��� ����� Ÿ���� ����ϴ� ���� �����Ѵ�.
		TreeSet<String> set = new TreeSet<String>();
		ArrayList list = new ArrayList<String>();
		set.add("ȫ�浿");
		set.add("��ũ");
		set.add("�츣��");
		set.add("ȫ�浿"); //�ߺ��� �������� ����
		set.add("ȫ�浿"); //�ߺ��� �������� ����
		
		System.out.println(set.size()); //3 �ߺ��� �����ϰ� ������ üũ
		//TreeSet�� Ư¡�� ���ı���� ����Ǿ� �ִ�.
		System.out.println(set);
		
		Iterator<String> i = set.iterator();
		for(int i2=0; i2<set.size();i2++) {
			System.out.println(i.next());
		}
		

		
	}

}
