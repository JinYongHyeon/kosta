package step3;

public class TestRefArray6 {

	public static void main(String[] args) {
		FriendVO[] f = {
				new FriendVO("��ŷ","����",28,"����"),
				new FriendVO("������","����",29,"���"),
				new FriendVO("�����","21����",21,"����"),
				new FriendVO("���ػ�","��縶",28,"�д�"),
				new FriendVO("������","����",27,"�д�")
		};
		
		FriendService service = new FriendService();
		//25�� �̻��� ģ�� �̸��鸸 ���
		System.out.println("***���� �˻� ���***");
		service.findNamesByAgs(f,25);	
		System.out.println("***�ּ� �˻� ���***");
		//�д翡 ��� ģ���� �г����� ���
		service.findNickAddress(f,"�д�");
		System.out.println("***�̸�(��) �˻� ���***");
		//�д翡 ��� ģ���� �г����� ���
		service.findNameByFirstName(f,"��");
		
		
	}

}
