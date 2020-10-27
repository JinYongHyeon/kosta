package org.kosta.model;

public class PersonVO {
	private String name;
	private int age;
	private CarVO carVo; // has a , aggregation 관계


	public PersonVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	public PersonVO(String name, int age, CarVO carVo) {
		super();
		this.name = name;
		this.age = age;
		this.carVo = carVo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public CarVO getCarVo() {
		return carVo;
	}

	public void setCarVo(CarVO carVo) {
		this.carVo = carVo;
	}


	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", age=" + age + "]";
	}

}
