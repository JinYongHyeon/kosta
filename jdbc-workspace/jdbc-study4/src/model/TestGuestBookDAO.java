package model;

import java.util.ArrayList;

public class TestGuestBookDAO {

	public static void main(String[] args) {
		try {
			GuestBookDTO dto = new GuestBookDTO("테스트","마칠 시간이 다가왔습니다.");
			GuestBookDAO dao = new GuestBookDAO();
			dao.register(dto);
			System.out.println(dto+"등록 완료");
			
			System.out.println("**********GuestBook List**********");
			ArrayList<GuestBookDTO> list = dao.getAllGuestBookListOrderByNoDesc(); 
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
