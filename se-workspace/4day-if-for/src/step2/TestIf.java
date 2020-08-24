package step2;

public class TestIf {

	public static void main(String[] args) {
		int age = 15;
		if (age > 18) { // 18세를 초과하면
			System.out.println(age + "세 성인");
		} else if (age > 13) {
			System.out.println(age + "세 청소년");
		} else {
			System.out.println(age + "세 어린이");
		}
	}
}
