package step2;

public class Person extends Animal {

	@Override
	public void play() {
		System.out.print("사람이 데이트하며 ");
		super.play();
	}
	
	public void ticket() {
		System.out.println("티켓 구매 완료");
	}
	

}
