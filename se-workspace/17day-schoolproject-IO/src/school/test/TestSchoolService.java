package school.test;

import school.controller.SchoolController;

/*
 * 비즈니스 로직을 담당하는 SchoolService를 단위 테스트하는 클래스
 */
public class TestSchoolService {

	public static void main(String[] args) {
		SchoolController controller = new SchoolController();
		System.out.println("*******학사관리프로그램을 시작합니다******");
		
		controller.execute();

	}
}
