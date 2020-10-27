package model;

public class MockDAO {
	private static MockDAO dao = new MockDAO();

	private MockDAO() {
		System.out.println("생성자 호출 성공 Singleton");
	};

	public static MockDAO getInstance() {
		return dao;
	}
	
	public CarVO selectCarById(String id) {
		CarVO vo = null;
		if(id.equals("1234")) {
			vo = new CarVO(id,"홍길동","모닝","판교");
		}
		return vo;
	}
	
	public void registerCar(CarVO carVO) {
		System.out.println(carVO + "정보를 db table에 insert");
	}
	
	public void deleteCar(String id) {
		System.out.println(id+"car 정보 delete~");
	}
}
