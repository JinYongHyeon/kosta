	package step2;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	//Set �迭�̹Ƿ� �ߺ��� ������� �ʰ� �Է¼����� ����Ѵ�.
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("¥���");
		set.add("���");
		set.add("«��");
		set.add("�����");
		set.add("�̸�");
		set.add("���İ�Ƽ");
		set.add("�Ľ�Ÿ");
		set.add("���");
		
		System.out.println(set);
	}

}
