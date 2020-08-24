package step2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TestIterator3 {

	public static void main(String[] args) {
		DataService service = new DataService();
		Scanner sc = new Scanner(System.in);
		
		String type = sc.nextLine();
		//Iterator�� �̿��ϸ� �پ��� �÷��� ���� ��ü���� ��ȯ�Ǿ ������ ������� ��ҵ��� ������ �� �ִ�.
		Collection<String> coll = service.searchData(type);
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
