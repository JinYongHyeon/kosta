package step3;

class Fish {
	static int count; // static ���� �� : Object�� member�� ��ü ������ heap ������ ���� ��ü ������ ����
	int point;
	//���� ù ������ class loading �� static �� �ʱ�ȭ �ȴ�.


	public Fish() {
		count++;
		point++;
	}
}

public class TestStatic4 {
	public static void main(String[] args) {
		Fish f = new Fish();
		System.out.println(f.count);
		Fish f2 = new Fish();
		System.out.println(f2.count);
		Fish f3 = new Fish();
		System.out.println(f3.count);

		Fish f4 = new Fish();
		Fish f5 = f4;
		Fish f6 = f5;
		
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f6.point);

	}

}
