package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;

public class TestMemberDAO {

	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			String id = "YH";
			MemberVO vo = dao.findMemberByID(id);

			ArrayList<MemberVO> list = dao.findMemberByID2(id);
			if (vo == null) {
				System.out.println(id + "아이디에 해당하는 회원정보가 없습니다.");
			} else {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				System.out.println("검색결과 : " + vo);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
