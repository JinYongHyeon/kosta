package step2;

public class MyData {
	private int day;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day<32) {
		this.day = day;
		}else {
			System.out.println("31�� �ʰ��� �߸��� �Է��Դϴ�.");
			this.day = 1;
		}
	}
}
