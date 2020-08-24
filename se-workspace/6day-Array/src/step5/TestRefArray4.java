package step5;

public class TestRefArray4 {

	public static void main(String[] args) {
		
		Product p[] = {
				new Product("MacBook", 1500000),
				new Product("VARMILO", 150000),
				new Product("leopold", 135000)
		};
		Shop shop = new Shop();
		shop.printAvgPrice(p);
		
	}

}
