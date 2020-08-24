package step5;

class Zoo {
	//다형성이 적용된 매개변수로 처리하면 Animal 자식 객체의 종류수와 관계없이 하나의 메서드에서 모두 처리할 수 있다. ㅇㅈ ㅇ ㅇㅈ
	public void pass(Animal p) {
		p.eat();
	}

	/* 이와 같이 객체의 종류가 새로 생성될 경우 이에 대응하는 처리 메서드는 계속 생성되어야 한다.
	 * 시스템의 결합도가 높아 유지보수성이 좋지 않다.
	 * 
	 * public void pass(Person p) { p.eat(); }
	 * public void pass(Monkey m) { p.eat();}
	 */
}

public class TestPolymorphism2 {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.pass(new Person());
		zoo.pass(new Monkey());
		// 그 외 동물원에 다양한 구성원 객체가 있다고 가정
	}

}
