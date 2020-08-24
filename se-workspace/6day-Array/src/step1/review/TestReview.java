package step1.review;

public class TestReview {

	public static void main(String[] args) {
		School sc = new School("코스타대학교");
		System.out.println(sc.getName());
		//School과  Student를 aggregation 관계로 표현
		Student stu = new Student("20","홍길동","판교");
	
		sc.setStudent(stu);
		System.out.println(sc.getStudent().getId());
		System.out.println(sc.getStudent().getName());
		System.out.println(sc.getStudent().getAddress());
		
	}

}
