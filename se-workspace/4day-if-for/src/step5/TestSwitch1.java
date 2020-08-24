package step5;

public class TestSwitch1 {

	public static void main(String[] args) {
		//switch case문 연습
		
		int grade = 2;
		switch (grade) {
		case 1:
			System.out.println("하버드");
			break; //실행문을 벗어나는자바 예약어
		case 2:
			System.out.println("칼바람의 나라");
			break;
		default: //위 case에 해당되지 않은 경우에 default가 실행이 된다.
			System.out.println("소환사협곡");
			break;
		}
	}

}
