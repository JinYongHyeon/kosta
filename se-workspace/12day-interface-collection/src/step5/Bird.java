package step5;
// Animal 상속 Flyer를 구현한다
public class Bird extends Animal implements Flyer {

	@Override
	public void fly() {
		System.out.println("새가 날다");
	}

}
