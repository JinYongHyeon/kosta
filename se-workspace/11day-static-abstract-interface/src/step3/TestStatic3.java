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
		
		
		//���ڿ��� �տ� ������ ���� ������ ���ڿ��� �ν�
		System.out.println(sNumber+sNumber2); //18
		//���ڿ� String�� ������ ��ȯ
		//java.lang.Integer�� static method�� parseInt(String s)�� Ȱ���ؼ� ���ڿ��� ������ ��ȯ
		System.out.println(Integer.parseInt(sNumber)+sNumber2);
	}

}
