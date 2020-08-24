package model;

public class Student extends Info {
	private String studentId;

	public Student(String tel, String name, String address, String studentId) {
		super(tel, name, address);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return super.toString()+", ÇÐ¹ø  : " + studentId ;
	}
	

}
