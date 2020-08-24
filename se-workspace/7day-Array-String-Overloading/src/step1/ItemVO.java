package step1;

/* 자바 클래스명 관례
 * VO : value Object(값 저장)
 * Service : 비즈니스 로직을 담당하는 객체
 * DAO : Data Access Object : 데이터 제어 객체
 * DTO : Data Transfer Object : 데이터 전송 객체
 */
public class ItemVO {
	private String model;
	private int price;

	public ItemVO(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
