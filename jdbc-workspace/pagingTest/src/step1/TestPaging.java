package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPaging {

	public void selectCount(int pagingNum) {
		
		int row = 10; //10개씩
		int page = 5; //5개씩
		
		int rowEnd = 0; //게시물 마지막
		int nowrowStart = 0; //현게시물 시작번호
		int nowrowEnd = 0; //현 게시물 마지막 번호
		
		int pageEnd =0;
		
		int groupNo =0;//현 그룹번호
		int groupStart = 0;//현 페이지 그룹 시작번호
		int groupEnd = 0;//현 페이지 그룹 마지막 번호
		
		int next = 0;//페이지 앞으로
		int back =0; //페이지 뒤로
		
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
			System.out.println("페이지 번호를 입력해주세요 1 ~ 10");
			String paginNumber = sc.nextLine();
			selectCount(Integer.parseInt(paginNumber));
			if(paginNumber.equals("종료"))break;
		}

	}

	public void insert() {
		try {
			NoticDAO dao = new NoticDAO();
			for (int i = 0; i < 100; i++) {
				Thread.sleep(1000);
				dao.noticInsert(new NoticVO("타이틀" + i, "내용" + i, 0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TestPaging().execute();
		//new TestPaging().insert();
		//System.out.println("끝");
		//int startNum = (2 - 1) * 10 + 1;

	}

}
