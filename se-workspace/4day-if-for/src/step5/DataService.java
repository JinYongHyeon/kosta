package step5;

public class DataService {

	public void printLiastDay(int month) {
		/*
		 * 2월 28일 4,6,9,11일 : 30일 1,3,5,7,8,10,12 31일
		 */
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일입니다.");
			break;
		case 2:
			System.out.println("28일입니다.");
			break;
		default:
			System.out.println("잘못 된 입력값입니다.");
			break;
		}
	}

}
