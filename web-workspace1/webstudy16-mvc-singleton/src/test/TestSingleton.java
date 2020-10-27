package test;
/*
 *  Company 클래스에 Singleton Design pattern을 적용해본다
 * */

class Company {
	private String companyInfo = "회사정보";
	// class loading시에 단 한번 실행된다.
	private static Company instance = new Company();

	// 생성자에 private 을 명시해 외부에서 생성하는 것을 방지한다.
	private Company() {
		System.out.println("Compnay 객체 생성");
	}

	// 외부에 사용할 수 있게 public static method로 instance를 반환한다.
	public static Company getInstance() {
		return instance;
	}

	// 사용자가 서비스 받을 메서드
	public String getCompanyInfo() {
		return companyInfo;
	}
}

public class TestSingleton {

	public static void main(String args[]) {
		// private 생성자이므로 error, 외부에서 객체 생성 할 수 없다.
		// Company c1 = new Company();
		// 생성할 수 없지만 사용할 수 있다.
		Company c1 = Company.getInstance();
		System.out.println(c1);
		System.out.println(c1.getCompanyInfo());
		Company c2 = Company.getInstance();
		System.out.println(c2);
		//압축
		System.out.println(Company.getInstance().getCompanyInfo());
	}
}
