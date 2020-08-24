package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPaging {

	public void selectCount(int pagingNum) {
		
		int row = 10; //10����
		int page = 5; //5����
		
		int rowEnd = 0; //�Խù� ������
		int nowrowStart = 0; //���Խù� ���۹�ȣ
		int nowrowEnd = 0; //�� �Խù� ������ ��ȣ
		
		int pageEnd =0;
		
		int groupNo =0;//�� �׷��ȣ
		int groupStart = 0;//�� ������ �׷� ���۹�ȣ
		int groupEnd = 0;//�� ������ �׷� ������ ��ȣ
		
		int next = 0;//������ ������
		int back =0; //������ �ڷ�
		
		try {
			NoticDAO dao = new NoticDAO();
			ArrayList<NoticVO> list = dao.noticeSelectAll();
			rowEnd = list.size();
			nowrowEnd = pagingNum * row;
			nowrowStart = nowrowEnd-(row-1);
			if(nowrowEnd>rowEnd) {
				nowrowEnd = rowEnd;
			}
					
			pageEnd = rowEnd/row+(rowEnd%row>0?1:0);
			if(pagingNum>pageEnd) {
				pagingNum = pageEnd;
			}
			
			groupNo = pagingNum/page + (pagingNum%page>0?1:0);
			groupEnd = groupNo * page;
			groupStart = groupEnd-(groupEnd-1);
			
			if(groupEnd>pageEnd){
				groupEnd = pageEnd;
			}
			
			ArrayList<NoticVO> list2 = dao.noticeSelcetPage(nowrowStart,nowrowEnd);
			for(NoticVO vo : list2)
			System.out.println(vo);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("������ ��ȣ�� �Է����ּ��� 1 ~ 10");
			String paginNumber = sc.nextLine();
			selectCount(Integer.parseInt(paginNumber));
			if(paginNumber.equals("����"))break;
		}

	}

	public void insert() {
		try {
			NoticDAO dao = new NoticDAO();
			for (int i = 0; i < 100; i++) {
				Thread.sleep(1000);
				dao.noticInsert(new NoticVO("Ÿ��Ʋ" + i, "����" + i, 0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TestPaging().execute();
		//new TestPaging().insert();
		//System.out.println("��");
		//int startNum = (2 - 1) * 10 + 1;

	}

}