package step4;

public class CreditCard {
	private String cusomerInfo;
	/*constructor(생성자)
	 * 생성자에 매개변수가 정의되어서 객체 생성시에는 매개변수에 알맞는 정보를 전달할 때만 객체 생성 할 수 있다.
	 */
	public CreditCard(String cusomerInfo) {
		this.cusomerInfo = cusomerInfo;
	}

	public String getCusomerInfo() {
		return cusomerInfo;
	}

	public void setCusomerInfo(String cusomerInfo) {
		this.cusomerInfo = cusomerInfo;
	}
	

}
