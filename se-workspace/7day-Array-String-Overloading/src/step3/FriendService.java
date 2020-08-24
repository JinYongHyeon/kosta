package step3;

public class FriendService {
	/*
	 * 25�� �̻� ���
	 */
	public void findNamesByAgs(FriendVO[] f, int age) {
		for (int i = 0; i < f.length; i++) {
			if (age <= f[i].getAge()) {
				System.out.println("�̸� : " + f[i].getName() + " " + f[i].getAge() + "��");
			}
		}
	}
	/*
	 * �ּ� �д� ���
	 */
	public void findNickAddress(FriendVO[] f, String address) {
		for (int i = 0; i < f.length; i++) {
			if(address.equals(f[i].getAddress())) {
				System.out.println("�̸� : " + f[i].getName() + " �ּ�  : " + f[i].getAddress());
			}
		}

	}
	/*
	 * �̸�(��)�� ������ �����ϴ� ��� ���
	 */
	public void findNameByFirstName(FriendVO[] f, String firstName) {
		for (int i = 0; i < f.length; i++) {
			if(f[i].getName().startsWith(firstName)){
				System.out.println(f[i].getName());
			}
		}
	}

}
