package model;

public class TestGuestBookDAO2 {

	public static void main(String[] args) {
		try {
			GuestBookDTO dto = new GuestBookDTO("�׽�Ʈ","��ĥ �ð��� �ٰ��Խ��ϴ�.");
			GuestBookDAO dao = new GuestBookDAO();
			//�Ʒ� �޼���� ���ܹ߻�
			//System.out.println(dao.getCurrentSequence());
			dao.register2(dto);
			System.out.println(dto);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
