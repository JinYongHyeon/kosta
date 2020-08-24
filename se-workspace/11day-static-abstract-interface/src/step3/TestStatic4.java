package step3;

class Fish {
	static int count; // static 없을 떄 : Object의 member로 객체 생성시 heap 영역의 각자 객체 공간에 샓게
	int point;
	//실행 첫 시점에 class loading 떄 static 이 초기화 된다.


	public Fish() {
		count++;
		point++;
	}
}

public class TestStatic4 {
	public static void main(String[] args) {
		Fish f = new Fish();
		System.out.println(f.count);
		Fish f2 = new Fish();
		System.out.println(f2.count);
		Fish f3 = new Fish();
		System.out.println(f3.count);

		Fish f4 = new Fish();
		Fish f5 = f4;
		Fish f6 = f5;
		
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f6.point);

	}

}
