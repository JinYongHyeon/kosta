package step4;

import java.util.Random;
import java.util.TreeSet;

public class LottoService {

	public TreeSet<Integer> createLottoNumber() {
		Random r = new Random();
		TreeSet<Integer> number = new TreeSet<Integer>();
		
/*		for (int i = 0; number.size()<7; i++) {
			number.add(r.nextInt(45)+1);
		}*/
		while(number.size()<7) {
			number.add(r.nextInt(45)+1);
		}
		return number;
	}

}
