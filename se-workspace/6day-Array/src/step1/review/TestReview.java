package step1.review;

public class TestReview {

	public static void main(String[] args) {
		School sc = new School("�ڽ�Ÿ���б�");
		System.out.println(sc.getName());
		//School��  Student�� aggregation ����� ǥ��
		Student stu = new Student("20","ȫ�浿","�Ǳ�");
	
		sc.setStudent(stu);
		System.out.println(sc.getStudent().getId());
		System.out.println(sc.getStudent().getName());
		System.out.println(sc.getStudent().getAddress());
		
	}

}
