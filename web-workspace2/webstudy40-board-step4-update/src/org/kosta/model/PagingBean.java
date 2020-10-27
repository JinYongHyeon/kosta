package org.kosta.model;

public class PagingBean {
	private int nowPage =1;
	//페이지당 게시물 수 
	private int postCountPerPage = 5;
	//페이지 수 
	private int postCountperPageGroup = 4;
	
	private int totalRow;
	
	

	public int getNowPage() {
		return nowPage;
	}

	public PagingBean(int totalRow) {
		this.totalRow = totalRow;
	}
	
	public PagingBean(int totalRow, int nowPage) {
		this.totalRow = totalRow;
		this.nowPage= nowPage;
	}
	//현 페이지 시작 번호
	public int getPageStartRow() {
		return (nowPage-1)*postCountPerPage+1;
	}
	
	//현 페이지 마지막 번호
	public int getPageEndRow() {
		return nowPage*postCountPerPage>totalRow?totalRow:nowPage*postCountPerPage;
	}
	
	//총 페이지 
	public int getTotalPage() {
		return totalRow%postCountPerPage==0?totalRow/postCountPerPage:totalRow/postCountPerPage+1;
	}
	//총 그룹 
	public int getTotalPageGroup() {
		return getTotalPage()%postCountperPageGroup==0?getTotalPage()/postCountperPageGroup:getTotalPage()/postCountperPageGroup+1;
	}
	
	//현재 그룹 번호
	public int getNowPageGroup(){
		return nowPage%postCountperPageGroup==0?nowPage/postCountperPageGroup:nowPage/postCountperPageGroup+1;
	}
	//현 그룹 시작 페이지번호
	public int getStartPageGroup() {
		return (getNowPageGroup()-1)*postCountperPageGroup+1;
	}
	//현 그룹 마지막 페이지번호
	public int getEndPageGroup() {
		return getNowPageGroup()*postCountperPageGroup>getTotalPage()?getTotalPage():getNowPageGroup()*postCountperPageGroup;
	}
	//이전 페이지
	public boolean isPreviousPageGroup() {
		return getStartPageGroup()>1?true:false;
	}
	//다음 페이지
	public boolean isNextPageGroup() {
		return getEndPageGroup()<getTotalPage()?true:false;
	}
	
	public static void main(String[] args) {
		PagingBean p = new PagingBean(47, 10);
		  // 현페이지의 시작 row number 를 조회 46
		  System.out.println("getBeginRowNumber:" + p.getPageStartRow());
		  // 현페이지의 마지막 row number 를 조회 47
		  System.out.println("getEndRowNumber:" + p.getPageEndRow());
		  // 전체 페이지 수 : 10
		  System.out.println("getTotalPage:" + p.getTotalPage());
		  // 전체 페이지 그룹 수 : 3
		  System.out.println("getTotalPageGroup:" + p.getTotalPageGroup());
		  System.out.println("////////////////////////////");
		  p = new PagingBean(31, 6);// 게시물수 31 현재 페이지 6
		  // 현페이지의 시작 row number 를 조회 26
		  System.out.println("getStartRowNumber:" + p.getPageStartRow());
		  // 현페이지의 마지막 row number 를 조회 30
		  System.out.println("getEndRowNumber:" + p.getPageEndRow());
		  // 게시물수 31 -> 총페이지수 7 -> 총페이지그룹->2
		 // 현재 페이지 그룹 : 2
		  System.out.println("getNowPageGroup:" + p.getNowPageGroup());
		  // 페이지 그룹의 시작 페이지 : 5
		  System.out.println("getStartPageOfPageGroup:" + p.getStartPageGroup());
		   // 페이지 그룹의 마지막 페이지 : 7
		  System.out.println("getEndPageOfPageGroup:" + p.getEndPageGroup());
		  // 이전 페이지 그룹이 있는 지 : true
		  System.out.println("isPreviousPageGroup:" + p.isPreviousPageGroup());
		  // 다음 페이지 그룹이 있는 지 : false
		  System.out.println("isNextPageGroup:" + p.isNextPageGroup());
	
	}
	
}
