package org.kosta.model;

public class MemberDTO {
	private String id;
	private String password;
	private String name;
	private String address;
	private CartBean cart;
	/**
	 * 회원당 장바구니는 없거나 한개만 생성
	 */

	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String password, String name, String address) {
		super();
		this.password = password;
		this.name = name;
		this.address = address;
	}

	public MemberDTO(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	/**
	 * getCart()를 처음 호출했을 때만 CartBean 객체를 생성하게 하고 CartBean 객체가 생성되어 있으면 기존 
	 * CartBean객체를 반환하게 한다.
	 */
	public CartBean getCart() {
		if(cart == null)
			cart = new CartBean();
		return cart;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + ", cart="
				+ cart + "]";
	}
	
}
