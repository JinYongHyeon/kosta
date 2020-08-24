package step5;

public class FlyerService {

	private Flyer[] array;
	private int index;

	public FlyerService(int length) {
		this.array = new Flyer[length];
	}

	public void addFlyer(Flyer f) {

		array[index++] = f;

	}	

	public void executeFly() {
		for (int i = 0; i < index; i++) {
			array[i].fly();
		}
	}

}
