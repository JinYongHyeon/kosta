package step1;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		Car c1 = new Car();
		System.out.println(c);
		c.model = "BMW";
		System.out.println(c.model);
		c.model = "���";
		
		c1.model ="���������";
		System.out.println(c.model);
		
		c.price = 100;
		System.out.println(c.price);
		
		c.drive();
		c1.drive();
		/*
		 *  c1 ������ Car ��ü�� �����Ѵ�. ������ ��ü�� Model �ν��Ͻ� ������ ����� �Ҵ��Ѵ�. �Ҵ��� model ������ ����غ���
		 */
	}

}
	