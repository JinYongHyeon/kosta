package step4;

public class CreditCard {
	private String cusomerInfo;
	/*constructor(������)
	 * �����ڿ� �Ű������� ���ǵǾ ��ü �����ÿ��� �Ű������� �˸´� ������ ������ ���� ��ü ���� �� �� �ִ�.
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
