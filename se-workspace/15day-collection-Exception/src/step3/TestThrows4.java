package step3;

import java.util.Scanner;

//Exception ���� keyword ��ü�� �̿��� ���α׷��� �ۼ��ϰ� �������� �����غ��� ����
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
	 * day�� 1���� �۰ų� 31�ϰ�� try ���ܰ� �߻����� -> catch�� -> finally �̵� / �̻��� ������� try -> finally ������ 
	 */
	public static void main(String[] args) {
		DateService service = new DateService();
	
		Scanner sc = new Scanner(System.in);
		try {
		service.register(sc.nextInt()); // 1���� �۰ų� 31�Ϻ��� Ŭ��� Console a k , ������ �������  b, a, c
		System.out.println("c");
		}catch(DayException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
