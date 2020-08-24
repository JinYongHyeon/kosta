package step6;

import step2.Animal;
import step2.Person;

public class ZooService2 {

	public void executeAll(Animal[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Person) {
				((Person) a[i]).ticket();
			}
			a[i].play();

		}
	}
}
