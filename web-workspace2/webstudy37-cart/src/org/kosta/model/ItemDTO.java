package org.kosta.model;


public class ItemDTO {
	private String itemNo;
	private String name;
	private String maker;
	private int pirce;
	private String detail;

	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDTO(String itemNo, String name, String maker, int pirce, String detail) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.maker = maker;
		this.pirce = pirce;
		this.detail = detail;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
