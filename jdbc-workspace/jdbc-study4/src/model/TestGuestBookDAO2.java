package model;

public class TestGuestBookDAO2 {

	public static void main(String[] args) {
		try {
			GuestBookDTO dto = new GuestBookDTO("테스트","마칠 시간이 다가왔습니다.");
			GuestBookDAO dao = new GuestBookDAO();
			//아래 메서드는 예외발생
			//System.out.println(dao.getCurrentSequence());
			dao.register2(dto);
			System.out.println(dto);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
