package step3;

public class MyDate {

	private int month;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month>=1&&month<=12) {
			this.month = month;
		
		} else {
			this.month = 1;
		}
	}

}
