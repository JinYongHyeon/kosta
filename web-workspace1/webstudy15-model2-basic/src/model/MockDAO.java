package model;

/*
 * 테스트를 위한 가짜  DAO
 */
public class MockDAO {
	public String findInfo(String id) {
		return id+"홍길동 판교";
	}
	
	public void insertCustomerInfo(String customerInfo) {
		System.out.println(customerInfo+" database table에  insert");
	}
}
