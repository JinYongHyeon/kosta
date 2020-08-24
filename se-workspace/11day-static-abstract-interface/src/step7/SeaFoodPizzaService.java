package step7;

import step6.PizzaService;

public class SeaFoodPizzaService extends PizzaService {

	@Override
	protected void topping() {
		System.out.println("해산물 토핑을 올리다.");
	}

}
