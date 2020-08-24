package step3;

public class Account {
	public String name = "홍길동"; //public 접근제어자
	String id ="ghdrlfehd"; // 디폴트 접근제어자
	private String password="123456"; //private 접근제어자
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
