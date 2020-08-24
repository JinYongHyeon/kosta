package step8;

import step6.PizzaService;
import step7.PotatoPizzaService;
import step7.SeaFoodPizzaService;

public class TestPizzaService {
	public static void main(String[] args) {
		//포테이토 피자를 만들기 위해 메소드를 호출해 본다.
		PotatoPizzaService ps = new PotatoPizzaService();
		ps.makePizza();
		System.out.println("***********************************");
		//step7에 SeaFoodPizzaService를 구현해본다. 
		SeaFoodPizzaService ss = new SeaFoodPizzaService();
		ss.makePizza();
		System.out.println("***********************************");
		//다형성 적용 - 부모 타입으로 자식 객체를 참조 
		PizzaService p = new PotatoPizzaService();
		p.makePizza();
		System.out.println("***********************************");
		PizzaService[] array = {new PotatoPizzaService(),new SeaFoodPizzaService()};
		for(int i=0;i<array.length;i++) {
			array[i].makePizza();
			System.out.println("***************for문********************");
		}
	}
}
