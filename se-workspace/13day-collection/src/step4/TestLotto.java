package step4;

import java.util.TreeSet;

public class TestLotto {
	public static void main(String[] args) {
		//1 ~45까지 중복되지 않은 임의의 수 6개를 TreeSet에 담아 반환
		LottoService service = new LottoService();
		
		TreeSet<Integer> set = service.createLottoNumber();
		System.out.println("이번주 로또 번호"+set);
		
	}
}
