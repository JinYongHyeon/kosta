package step3;

class Test{
	static int point = 0;
	
	public Test() {
		point++;
	}
}

public class TestStatic3 {
	
	public static void main(String[] args) {
		String sNumber = "1";
		int sNumber2 = 8;
		
		Test t1 = new Test();
		new Test();
		new Test();
		System.out.println("number : "+Test.point);
		
		
		//문자열이 앞에 나오면 이후 연산은 문자열로 인식
		System.out.println(sNumber+sNumber2); //18
		//문자열 String을 정수로 변환
		//java.lang.Integer의 static method인 parseInt(String s)을 활용해서 문자열을 정수로 변환
		System.out.println(Integer.parseInt(sNumber)+sNumber2);
	}

}
