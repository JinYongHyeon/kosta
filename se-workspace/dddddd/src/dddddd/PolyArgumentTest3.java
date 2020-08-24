package dddddd;

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		//부모 money bounsPoint 
		
		Buyer b= new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Autdio audio = new Autdio();
		
		b.buy(tv);//tv 구입하였습니다.
		b.buy(com);//Computer 구입하였습니다.
		b.buy(audio);//Audio 구입하였습니다.
	//	b.summary();//구입하신 불품은 TVm Computer,Audio입니다.
		System.out.println();
//		b.refund(com); // Computer을 반품하셨습니다.
//		b.summary(); // 구입하신 물품은 총금액은 150만원입니다. 구입하신 제품은 Tv , Audio
	}

}
