package step3;

/*
 * static �ʱ�ȭ �� �׽�Ʈ ����
 * main ���� ���� ����ȴ�.
 * static �ʱ�ȭ ������ ���� ���� ����ȴ�.
 */
public class TestStaitc5 {

	public static void main(String[] args) {
		System.out.println("��ġ���� 2 / main �޼ҵ� ����");
	}

	static { //���α׷� �����۾�
		System.out.println("��ġ���� 1"); //static �ʱ⿵�� ����
	}
}
