package step1;

//�ڹ� ����� �׽�Ʈ
public class TestOperator1 {

	public static void main(String[] args) {
		int i = 7;
		int j = 3;

		System.out.println(i + "*" + j + "=" + i * j);
		System.out.println(i + "/" + j + "=" + i / j);
		System.out.println(i + "%" + j + "=" + i % j);
		System.out.println(i + "=" + j + "=" + (i = j));
		System.out.println(i + "==" + j + "=" + (i == j));

		boolean flag = false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("***����������***");

		int k = 7;
		System.out.println(k++); // ���� �� ����
		System.out.println(k);
		System.out.println(++k); // ���� �� ����
		System.out.println(k);
		System.out.println(--k);
		System.out.println(k--); // 8
		System.out.println(k); // 7
		System.out.println("*********");

		int money = 100;
//		money= money+200; 
		money+=250;
		System.out.println(money);
		money-=100; // money = money-100; equals(true)
		System.out.println(money);
		System.out.println("*********");
		//���׿����� (���ǽ�)? ��1 : ��2 --> ������ ���̸� ��1 �����̸� ��2 ����\
		int x= 10;
		int result = (x>0)? x+1:x+2;
		System.out.println(result);
		
	}
}
