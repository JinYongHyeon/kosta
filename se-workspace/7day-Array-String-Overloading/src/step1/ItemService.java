package step1;

public class ItemService {

	public void printAllModel(ItemVO[] item) {
		for (ItemVO modelItem : item) {
			System.out.println(modelItem.getModel());
		}
	}

	public void printMaxPirce(ItemVO[] item) {
		int maxPrice = Integer.MIN_VALUE;
		
		for (int i = 0; i < item.length; i++) {
			if(item[i].getPrice()>maxPrice) {
				maxPrice = item[i].getPrice();
			}
		}
		System.out.println("기기 최고값 : "+ maxPrice);
	}

}
