	package step3;

import step2.CDPlayer;
import step2.Youtube;

public class TestInterface3 {

	public static void main(String[] args) {
		PlayService service = new PlayService();
		service.execute(new Youtube());
		service.execute(new CDPlayer());
		
	}

}
