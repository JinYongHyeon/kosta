package step3;

import java.util.Scanner;

class AgeException extends Exception {
	public AgeException() {
		super("���������� ������ �ֽ��ϴ�.");
	}
	
	public AgeException(String exception) {
		super(exception);
	}
}

class MovieService {
	public String enter(int age) throws AgeException {
		
		if(age < 1) {
			throw new AgeException();
		}
		System.out.println("���� ���� ��ȭ ����");
		return "���尡��";
	}

	public String enterAdultMovie(int age) throws AgeException {
		if(age < 1) {
			throw new AgeException(); //Exception
		}else if(age < 20) {
			throw new AgeException("����� "+age+"�� �̼����ڿ��� �����Ұ��Դϴ�.");
		}
		System.out.println("���ο�ȭ��������");
		return "���ο�ȭ";
	}
}


public class TestThrows2 {

	public static void main(String[] args) {
		AgeException exception = new AgeException();
		MovieService ms = new MovieService();
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���  : ");
		int age = sc.nextInt();
		try {
		/*
		System.out.println(ms.enter(age));
		System.out.println(ms.enter(age-1));
		*/
			System.out.println(ms.enterAdultMovie(age));
		}catch(AgeException a) {
			System.out.println(a.getMessage());
		}
		System.out.println("���α׷� �������");
	}
}
