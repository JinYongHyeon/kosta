package step7;

public class TestAggregation2 {

	public static void main(String[] args) {
		//�Ʒ� �ڵ尡 ����ǵ��� �����ϴ� Ŭ�������� �����غ���
		Student st = new Student("Ƽ��");
		System.out.println(st.getName());
		st.setBook(new Book("�鼳����","�׸�����"));
		System.out.println(st.getBook().getTitle());//�鼳����
		System.out.println(st.getBook().getAuthor());//�׸�����
	}

}
