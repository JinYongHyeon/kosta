package model;

public class NoticeVO {
	private String no;
	private String title;
	private String content;
	private String writer;
	private String date;
	private int point;

	public NoticeVO(String no, String title, String writer, String date, int point) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.point = point;
	}



	public NoticeVO(String no, String title, String content, String writer, String date, int point) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.point = point;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
