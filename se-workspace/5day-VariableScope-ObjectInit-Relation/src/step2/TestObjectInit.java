package step2;
/*
 * ��ü ���� �ʱ�ȭ �ܰ踦 �����ϴ� ����
 */
public class TestObjectInit {

	public static void main(String[] args) {
		/*
		 * Car : Ŭ���������� ������ ������ Ÿ��
		 * car : ����(��������, ��������)
		 * = : �Ҵ� �Ǵ� ����
		 * new : �ڹ� �����(Ű����)
		 * Car() : ������ Constructor
		 */
		Car car = new Car();
		System.out.println(car.isFlag());//�⺻ �ʱ�ȭ false
		System.out.println(car.getPrice());//�⺻ �ʱ�ȭ 0.0
		System.out.println(car.getModel());//�⺻ �ʱ�ȭ null
	}

}
