package model;

public class EmployeeDTO {
	private String empno;
	private String ename;
	private int sal;
	private DepartmentDTO departmentDTO; // has a, aggregation

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public EmployeeDTO(String empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public EmployeeDTO(String empno, String ename, int sal, DepartmentDTO departmentDTO) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.departmentDTO = departmentDTO;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public DepartmentDTO getDepartmentDTO() {
		return departmentDTO;
	}

	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}

	@Override
	public String toString() {
		return "empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", departmentDTO=" + departmentDTO;
	}
	

}
