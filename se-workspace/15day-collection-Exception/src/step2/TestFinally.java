package step2;

public class TestFinally {

	public static void main(String[] args) {
		String name = null;
		try {
		System.out.println(name.length());
		System.out.println("�߰��۾�");
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("��");
		}finally {
			System.out.println("finally�������");
		}
		System.out.println("�������");
	}

}
