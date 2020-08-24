package step6;

public class TestAggregation {
	/*
	 * 객체 간의 관계
	 * association[use a] > aggregation[has a] 
	 */
	public static void main(String[] args) {
		//사람은 스마트 폰을 가지고 사용한다.
		//필요 클래스는? Person , SmartPhone 
		//아래 코드를 보고 알맞는 Person class를 구현한다.
		
		Person p = new Person("홍길동");
		System.out.println(p.getName());
		
		p.setSmartPhone(new SmartPhone("갤9",100)); // Person에서 smartphone객체를 생성 갤9 100 선언을 시키는데.
		System.out.println(p.getSmartPhone().getModel());//갤럭시9
		System.out.println(p.getSmartPhone().getPrice());//100
		//홍길동님의 폰 모델명을 갤20으로 수정해본다
		p.getSmartPhone().setModel("갤20");
		System.out.println(p.getSmartPhone().getModel());
	}
}
