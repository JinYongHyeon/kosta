package step6;

public class Person {
	private String name;
	//SmartPhone�� Ŭ���������� ������ ������ Ÿ��
	private SmartPhone smartPhone;
	
	
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(SmartPhone smartphone) {
		this.smartPhone = smartphone;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
