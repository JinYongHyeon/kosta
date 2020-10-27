package org.kosta.model;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private  HitsBean hitsBean;
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
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
	public HitsBean getHitsBean() {
		if(this.hitsBean == null)
			this.hitsBean = new HitsBean();
		return this.hitsBean;
	}
	
	
}
