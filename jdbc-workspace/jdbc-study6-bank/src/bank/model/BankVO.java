package bank.model;

public class BankVO {
	private int bankNo;
	private String name;
	private String password;
	private int blance;

	public BankVO(int bankNo) {
		super();
		this.bankNo = bankNo;
	}

	public BankVO(int bankNo, String password) {
		super();
		this.bankNo = bankNo;
		this.password = password;
	}

	public BankVO(int bankNo, String password, int blance) {
		super();
		this.bankNo = bankNo;
		this.password = password;
		this.blance = blance;
	}
	
	
	
	public BankVO(String name, String password, int blance) {
		super();
		this.name = name;
		this.password = password;
		this.blance = blance;
	}

	public BankVO(int bankNo, String name, String password, int blance) {
		super();
		this.bankNo = bankNo;
		this.name = name;
		this.password = password;
		this.blance = blance;
	}

	public int getBankNo() {
		return bankNo;
	}

	public void setBankNo(int bankNo) {
		this.bankNo = bankNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBlance() {
		return blance;
	}

	public void setBlance(int blance) {
		this.blance = blance;
	}

	@Override
	public String toString() {
		return "bankNo= " + bankNo + ", name=" + name + ", password=" + password + ", blance=" + blance + "]";
	}

}
