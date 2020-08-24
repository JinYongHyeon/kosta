package model;

public class DepartmentDTO {
	private String depntno;
	private String dname;
	private String loc;
	private String tel;

	public DepartmentDTO() {
		super();
	}
	
	public DepartmentDTO(String depntno, String dname, String loc, String tel) {
		super();
		this.depntno = depntno;
		this.dname = dname;
		this.loc = loc;
		this.tel = tel;
	}


	public String getDepntno() {
		return depntno;
	}

	public void setDepntno(String depntno) {
		this.depntno = depntno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "depntno=" + depntno + ", dname=" + dname + ", loc=" + loc + ", tel=" + tel;
	}
	
}
