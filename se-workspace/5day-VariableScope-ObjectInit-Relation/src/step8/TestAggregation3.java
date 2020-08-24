package step8;

public class TestAggregation3 {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setName("유스페이스편의점");
		shop.setProduct(new Product("새우깡","농심",1000));
		System.out.println(shop.getName());
		System.out.println(shop.getProduct().getName());
		System.out.println(shop.getProduct().getMaker());
		System.out.println(shop.getProduct().getPrice());
		
		//새우깡 가격을 1200 으로 수정해본다
		shop.getProduct().setPrice(1200);
		System.out.println(shop.getProduct().getPrice());
	}

}
