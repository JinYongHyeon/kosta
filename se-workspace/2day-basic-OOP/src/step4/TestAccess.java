package step4;
import step3.Account;

//���������ڸ� �׽�Ʈ�ϴ� ����
public class TestAccess {

	public static void main(String[] args) {
		Account a = new Account();
		
		//a.name==public a.id==defualt 	
		System.out.println("�̸� : "+a.name);
		

		System.out.println("�н����� : " + a.getPassword());
		}
}
