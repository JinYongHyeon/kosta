package step6;

public class TestAggregation {
	/*
	 * ��ü ���� ����
	 * association[use a] > aggregation[has a] 
	 */
	public static void main(String[] args) {
		//����� ����Ʈ ���� ������ ����Ѵ�.
		//�ʿ� Ŭ������? Person , SmartPhone 
		//�Ʒ� �ڵ带 ���� �˸´� Person class�� �����Ѵ�.
		
		Person p = new Person("ȫ�浿");
		System.out.println(p.getName());
		
		p.setSmartPhone(new SmartPhone("��9",100)); // Person���� smartphone��ü�� ���� ��9 100 ������ ��Ű�µ�.
		System.out.println(p.getSmartPhone().getModel());//������9
		System.out.println(p.getSmartPhone().getPrice());//100
		//ȫ�浿���� �� �𵨸��� ��20���� �����غ���
		p.getSmartPhone().setModel("��20");
		System.out.println(p.getSmartPhone().getModel());
	}
}
