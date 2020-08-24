package step2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TestIterator3 {

	public static void main(String[] args) {
		DataService service = new DataService();
		Scanner sc = new Scanner(System.in);
		
		String type = sc.nextLine();
		//Iterator를 이용하면 다양한 컬렉션 하위 객체들이 반환되어도 동일한 방법으로 요소들을 열거할 수 있다.
		Collection<String> coll = service.searchData(type);
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
