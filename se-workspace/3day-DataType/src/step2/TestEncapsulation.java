package step2;
/*
 * �Ʒ� �ڵ忡 �����Ǵ� Ŭ������ �����غ��� ����
 * 
 */
public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData d = new MyData();
		//d.day=2;s//���ٺҰ�
		
		d.setDay(10);
		System.out.println(d.getDay());
		
		System.out.println("*************");
		
		MyData d2 = new MyData();
		d2.setDay(32); // 32�� �߸��� �Է°��Դϴ�.
		System.out.println(d2.getDay() + "��"); //1�� ����
		
	}

}
