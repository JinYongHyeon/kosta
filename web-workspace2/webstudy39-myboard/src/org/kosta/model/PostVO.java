package org.kosta.model;

public class PostVO {
	private String no;
	private String title;
	private String content;
	private int hits;
	private String timePosted;
	private MemberVO mebmerVO;

	public PostVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostVO(String no, String title, String content, int hits, String timePosted, MemberVO mebmerVO) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.hits = hits;
		this.timePosted = timePosted;
		this.mebmerVO = mebmerVO;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getTimePosted() {
		return timePosted;
	}

	public void setTimePosted(String timePosted) {
		this.timePosted = timePosted;
	}

	public MemberVO getMebmerVO() {
		return mebmerVO;
	}

	public void setMebmerVO(MemberVO mebmerVO) {
		this.mebmerVO = mebmerVO;
	}

}
