package step5;

public class TestSwitch1 {

	public static void main(String[] args) {
		//switch case�� ����
		
		int grade = 2;
		switch (grade) {
		case 1:
			System.out.println("�Ϲ���");
			break; //���๮�� ������ڹ� �����
		case 2:
			System.out.println("Į�ٶ��� ����");
			break;
		default: //�� case�� �ش���� ���� ��쿡 default�� ������ �ȴ�.
			System.out.println("��ȯ������");
			break;
		}
	}

}
