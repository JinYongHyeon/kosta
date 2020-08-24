package step3;
/*
 * 객체 초기화 단계 공부예정
 */
public class TestObjectInit2 {

	public static void main(String[] args) {
		Friend f = new Friend("피지컬",21);
		
		System.out.println(f.getName()+" "+f.getAge()+"세");
		System.out.println(f.getMoney());
		
	}

}
