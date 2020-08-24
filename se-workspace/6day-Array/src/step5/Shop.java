package step5;

import java.text.DecimalFormat;

public class Shop {
	int sum;
	int avg;
	
	DecimalFormat df = new DecimalFormat("###,###.##");
	
	public void printAvgPrice(Product[] p) {
		for(int i=0; i<p.length; i++) {
			sum +=p[i].getPrice();
		}
		avg = sum/p.length;
		System.out.println("상품평균 가격 : " + df.format(avg)+"원");
	}	

}
