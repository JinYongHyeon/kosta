package step4;
import step3.Account;

//접근제어자를 테스트하는 예제
public class TestAccess {

	public static void main(String[] args) {
		Account a = new Account();
		
		//a.name==public a.id==defualt 	
		System.out.println("이름 : "+a.name);
		

		System.out.println("패스워드 : " + a.getPassword());
		}
}
