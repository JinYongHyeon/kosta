package step6;
//abstract class : 자식에게 유용한 멤버를 상속시키고 스스로 객체화되지 않는다. / 자식 객체생성을 통해서 객체생성은 된다.
public abstract class PizzaService {
	
	protected void  prepare() {
		System.out.println("도우를 만들다");
	}
	//부모 차원에서 구현할 수 없고, 반드시 자식 클래스에서 구현해야 하는 메서드
	protected abstract void topping();
	
	protected void bake() {
		System.out.println("굽다");
	}
	
	protected void cutting() {
		System.out.println("자르다");
	}
	
	protected void boxing() {
		System.out.println("포장하다");
	}
	/**
	 * 외부에서 편리하게 사용할 수 있도록 메서드를 제공
	 * 템플릿 메서드 패턴
	 * 템플릿 메서드는 피자의 작업 절차를 정의해서 자식에게 물려준다.
	 */
	public void makePizza() {
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}

//추상 클래스 공통 기능은 구현해주데 자식에서 구현해줘야 될 거는 추상 메소드로 만들고 상속이 안받은 타 클래스에서 쓸 때 없는 객체 생성을 통하여 시스템 불필요한 호출 방지를 위해서 한다?