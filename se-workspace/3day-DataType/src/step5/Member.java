package step5;

//class
public class Member {
	//instance variable 인스턴스 변수 : 객체 속성 정보를 저장하는 공간
	private String id;
	private String name;
	//생성자(Constructor)
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

}
