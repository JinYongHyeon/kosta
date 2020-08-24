package school.test;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;
import school.model.Employee;
import school.model.Person;
import school.model.Student;
import school.model.Teacher;
import school.service.SchoolService;

/*
 * 비즈니스 로직을 담당하는 SchoolService를 단위 테스트하는 클래스
 */
public class TestSchoolService {
	public static void main(String[] args) {
		/*SchoolService service = new SchoolService();
		System.out.println("**구성원 정보 추가 시작**");
		service.addPerson(new Student("0101231234", "정예울", "용인", "17"));
		service.addPerson(new Teacher("0101231235", "신성호", "수지", "국어"));
		service.addPerson(new Student("0101231236", "이진욱", "수원", "16"));
		service.addPerson(new Employee("0101231237", "송영섭", "화성", "재무부"));
		service.addPerson(new Student("0101231238", "배율휘", "용인", "18"));
		service.addPerson(new Teacher("0101231239", "강희석", "용인", "수학"));
		System.out.println("**구성원 정보 추가 완료**");
		System.out.println("**추가시 중복확인**");
		// 존재하는 전화번호의 구성원이 추가되려고 할 때
		service.addPerson(new Student("0101231234", "아이유", "수원", "19"));
		// 위와 같이 동일한 tel을 가진 구성원을 추가했을 때
		// tel 이 중복되어 추가할 수 없습니다! 메세지 출력하고 추가하지 않는다
		System.out.println("**중복테스트 후 리스트 확인**");
		service.printAll();
		System.out.println("**구성원 전체 명단**");
		service.printAll();

		System.out.println("**tel로 검색메서드 테스트**");
		Person p = service.findPersonByTel("0101231236");
		System.out.println("검색결과:" + p);
		System.out.println("**삭제 테스트**");
		Person rp = service.removePersonByTel("0101231236");
		System.out.println("삭제대상:" + rp);
		System.out.println("**삭제 후 리스트 확인**");
		service.printAll();
		service.updatePerson(new Teacher("0101231237", "송영섭", "성남", "자바"));
		System.out.println("**수정 후 리스트 확인**");
		service.printAll();*/
		
		   SchoolService service = new SchoolService();
		     try {
		      service.addPerson(new Student("011", "공유", "판교", "14"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.addPerson(new Teacher("016", "수민", "강남", "국어"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.addPerson(new Employee("017", "아이유", "판교", "총무"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.addPerson(new Teacher("016", "고슬링", "판교", "자바"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     service.printAll(); 
		     System.out.println("****************step1:add 완료****************");
		     try {
		      Person rp = service.findPersonByTel(null);
		      System.out.println(rp);
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      Person rp = service.findPersonByTel("010");
		      System.out.println(rp);
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     System.out.println("****************step2:find 완료****************");  
		     try {
		      service.removePersonByTel("016");
		      System.out.println("삭제 ok");
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.removePersonByTel("010");
		      System.out.println("삭제 ok");
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     service.printAll();  
		     System.out.println("****************step3:delete 완료****************"); 
		     }
		 


	}

