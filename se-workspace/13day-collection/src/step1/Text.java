package step1;

public class Text {

	public static void main(String[] args) {
		Text t [] = new Text[5];
		try {
			for(int i=0; i<t.length; i++) {
				System.out.println(t[i]);
			}
		}catch(NullPointerException N) {
			System.out.println("°ª ¾øÀ½");
		}
	}

}
