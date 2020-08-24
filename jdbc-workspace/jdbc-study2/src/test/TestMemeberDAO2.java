package test;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
/*
 * MemberDAO�� getAllMemberList()�� �����ϴ� ����
 * MEMBER TABLE�� �ִ� ��� ȸ�� ������ ArrList<MemberVO>�� Ÿ�Կ� list�� ������ ��ȯ�޾� ���� ����
 */
public class TestMemeberDAO2 {

	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			
			ArrayList<MemberVO> memberList = dao.getAllMemberList();
			//if(memberList == null) ���� �� ��ȯ���� �� Null�� �ȹ��� list.size()�� ��
			if(memberList.isEmpty()) {
				System.out.println("���̺� �ο찡 �������� �ʽ��ϴ�.");
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
