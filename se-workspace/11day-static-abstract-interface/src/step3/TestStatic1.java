package step3;

public class TestStatic1 {
	//Object�� member (instance variable)
	//�Ʒ� money ������, test �޼���� ��ü ������ �� ���� �޸𸮿� �ε�ǰ� ��밡���ϴ�.
	int money = 100;

	public void test() {

	}
	//Class�� Member�� static ������ �޼���� ���� ù���� �� class loading ������ �޸𸮿� ����ȴ�. �� ������ ��ü ������ �ʿ����.
	static int sMoney = 100;

	public static void stest() {
		System.out.println("asd");
	}

	public static void main(String[] args) {
		/*
		 * �Ʒ� �ڵ�� complie error -> ������ static method �����̹Ƿ� non-static(Object�� member)����
		 * ���� ������ �� ������ ���������� �����Ǿ� �ִ�. �� static ���� non-staitc ���� ���� ������ �� ����.
		 * System.out.println(money); test(); ���� static ������ ���� ����
		 */
		System.out.println(sMoney);
		stest();
	}
}
