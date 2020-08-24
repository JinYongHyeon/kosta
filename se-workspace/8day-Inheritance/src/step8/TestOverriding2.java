package step8;

public class TestOverriding2 {
	
	public static void main(String[] args) {
		Employee e = new Employee("20","정지윤",1500);
		System.out.println(e.getDetails());
		//사원번호:20 사원명:정지윤 월급:1500
		
		Engineer en = new Engineer("18","이홍재",1700,"spring");
		System.out.println(en.getDetails());
	}
}
