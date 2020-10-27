package org.kosta.model;

public class EmployeeDTO {
	private String empNo;
	private String eName;
	private int sal;
	private String deptNo;
	private DepartmentDTO departmentDTO; // has a or aggregation 관계

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(String empNo, String eName, int sal, String deptNo, DepartmentDTO departmentDTO) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.sal = sal;
		this.deptNo = deptNo;
		this.departmentDTO = departmentDTO;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public DepartmentDTO getDepartmentDTO() {
		return departmentDTO;
	}

	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empNo=" + empNo + ", eName=" + eName + ", sal=" + sal + ", deptNo=" + deptNo
				+ ", departmentDTO=" + departmentDTO + "]";
	}

}
