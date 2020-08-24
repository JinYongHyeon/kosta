package step2;

public class ZooSerivce {

	/*
	 * 
	 */
	public void execute(Animal a) {
		a.play();
		if (a instanceof Person) {
			Person p = (Person) a;
			p.ticket();
		}
	}
}
