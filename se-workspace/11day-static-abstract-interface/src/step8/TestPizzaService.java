package step8;

import step6.PizzaService;
import step7.PotatoPizzaService;
import step7.SeaFoodPizzaService;

public class TestPizzaService {
	public static void main(String[] args) {
		//�������� ���ڸ� ����� ���� �޼ҵ带 ȣ���� ����.
		PotatoPizzaService ps = new PotatoPizzaService();
		ps.makePizza();
		System.out.println("***********************************");
		//step7�� SeaFoodPizzaService�� �����غ���. 
		SeaFoodPizzaService ss = new SeaFoodPizzaService();
		ss.makePizza();
		System.out.println("***********************************");
		//������ ���� - �θ� Ÿ������ �ڽ� ��ü�� ���� 
		PizzaService p = new PotatoPizzaService();
		p.makePizza();
		System.out.println("***********************************");
		PizzaService[] array = {new PotatoPizzaService(),new SeaFoodPizzaService()};
		for(int i=0;i<array.length;i++) {
			array[i].makePizza();
			System.out.println("***************for��********************");
		}
	}
}
