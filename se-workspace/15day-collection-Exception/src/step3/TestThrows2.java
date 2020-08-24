package step3;

import java.util.Scanner;

class AgeException extends Exception {
	public AgeException() {
		super("나이정보에 문제가 있습니다.");
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
		System.out.println("나이 정상 영화 시작");
		return "입장가능";
	}

	public String enterAdultMovie(int age) throws AgeException {
		if(age < 1) {
			throw new AgeException(); //Exception
		}else if(age < 20) {
			throw new AgeException("당신은 "+age+"살 미성년자여서 관람불가입니다.");
		}
		System.out.println("성인영화관람가능");
		return "성인영화";
	}
}


public class TestThrows2 {

	public static void main(String[] args) {
		AgeException exception = new AgeException();
		MovieService ms = new MovieService();
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요  : ");
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
		System.out.println("프로그램 정상수행");
	}
}
