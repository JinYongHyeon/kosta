package model;

abstract public class Info {
	private String tel;
	private String name;
	private String address;

	public Info(String tel, String name, String address) {
		super();
		this.tel = tel;
		this.name = name;
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 전화번호 : " + tel + ", 주소 : " + address;
	}

}
