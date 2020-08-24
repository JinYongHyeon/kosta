package step4;

public class Enginner extends Employee {
	private String skill;

	public Enginner(String empNo, String name, int salary, String skill) {
		super(empNo, name, salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return super.toString()+" skill = "+skill;
	}

}
