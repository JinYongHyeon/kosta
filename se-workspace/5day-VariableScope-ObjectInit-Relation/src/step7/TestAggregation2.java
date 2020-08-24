package step7;

public class TestAggregation2 {

	public static void main(String[] args) {
		//아래 코드가 실행되도록 대응하는 클래스들을 구현해본다
		Student st = new Student("티모");
		System.out.println(st.getName());
		st.setBook(new Book("백설공주","그림형제"));
		System.out.println(st.getBook().getTitle());//백설공주
		System.out.println(st.getBook().getAuthor());//그림형제
	}

}
