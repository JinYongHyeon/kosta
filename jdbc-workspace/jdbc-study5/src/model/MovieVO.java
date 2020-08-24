package model;

/*
 * DTO : Data Transfer Object
 * VO : Value Object
 */
public class MovieVO {
	private int id;
	private String title;
	private int attendacne;

	public MovieVO() {
		super();
	}

	public MovieVO(int id, String title, int attendacne) {
		super();
		this.id = id;
		this.title = title;
		this.attendacne = attendacne;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAttendacne() {
		return attendacne;
	}

	public void setAttendacne(int attendacne) {
		this.attendacne = attendacne;
	}

	@Override
	public String toString() {
		return "id=" + id + ", title=" + title + ", attendacne=" + attendacne;
	}
	

}
