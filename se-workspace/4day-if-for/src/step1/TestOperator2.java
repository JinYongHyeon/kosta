package step1;

/*
 * AND �� OR ����
 * 
 *  AND ��� �� �ϰ�� true
 *  OR ���� �ϳ��� ���ϰ�� true
 */

class OperatorEx{
	public boolean test1() {
//		System.out.println("test1");
		return false;
	}
	public boolean test2() {
//		System.out.println("test2");
		return true;
	}
}

public class TestOperator2 {

	public static void main(String[] args) {
	  OperatorEx ex = new OperatorEx();
	  System.out.println(ex.test1());
	  System.out.println(ex.test1()&&ex.test2()); // false
	  System.out.println(ex.test1()||ex.test2()); // true
	}

}
