package step2;

public class TestFinally {

	public static void main(String[] args) {
		String name = null;
		try {
		System.out.println(name.length());
		System.out.println("추가작업");
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("널");
		}finally {
			System.out.println("finally정상수행");
		}
		System.out.println("정상수행");
	}

}
