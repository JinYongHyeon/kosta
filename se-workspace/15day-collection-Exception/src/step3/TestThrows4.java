package step3;

import java.util.Scanner;

//Exception 관련 keyword 전체를 이용해 프로그램을 작성하고 실행결과를 예상해보는 예제
class DayException extends Exception{
	public DayException(String message) {
		super(message);
	}
}

class DateService{
	public void register(int day) throws DayException {
		try {
		if(day<1||day>31) throw new DayException("k");
		System.out.println("b");
		}finally {
			System.out.println("a");
		}
	}
}

public class TestThrows4 {
	/*
	 * day가 1보다 작거나 31일경우 try 예외가 발생구역 -> catch문 -> finally 이동 / 이상이 없을경우 try -> finally 순으로 
	 */
	public static void main(String[] args) {
		DateService service = new DateService();
	
		Scanner sc = new Scanner(System.in);
		try {
		service.register(sc.nextInt()); // 1보다 작거나 31일보다 클경우 Console a k , 문제가 없을경우  b, a, c
		System.out.println("c");
		}catch(DayException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
