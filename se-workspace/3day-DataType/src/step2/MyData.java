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
			System.out.println("31일 초과는 잘못된 입력입니다.");
			this.day = 1;
		}
	}
}
