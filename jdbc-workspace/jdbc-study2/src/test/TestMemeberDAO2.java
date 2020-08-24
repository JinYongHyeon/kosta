package test;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
/*
 * MemberDAO의 getAllMemberList()를 구현하는 예제
 * MEMBER TABLE에 있는 모든 회원 정보를 ArrList<MemberVO>에 타입에 list로 정보를 반환받아 보는 연습
 */
public class TestMemeberDAO2 {

	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			
			ArrayList<MemberVO> memberList = dao.getAllMemberList();
			//if(memberList == null) ㄴㄴ 값 반환받을 떄 Null로 안받음 list.size()로 비교
			if(memberList.isEmpty()) {
				System.out.println("테이블 로우가 존재하지 않습니다.");
			}else {
				for(int i=0;i<memberList.size();i++) {
					System.out.println(memberList.get(i));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
