package step4;

public class TestIf3 {

	public static void main(String[] args) {

		MyAccount account = new MyAccount();
		
		account.setBalance(100);
		
		System.out.println(account.getBalance());
		account.setBalance(-1); //잘못된 금액입니다 (0을 초과해야 한다)
		System.out.println(account.getBalance()); //100
		
		account.setBalance(500);
		System.out.println(account.getBalance());// 500출력
		
		System.out.println("***입금***");
		int money = 100;
		account.deposit(money); //600
		System.out.println(account.getBalance());
		money=-1;
		account.deposit(money);
		System.out.println(account.getBalance());
		
		System.out.println("***출금***");
		money=20;
		account.withdraw(money);
		System.out.println(account.getBalance());
		money= -1;
		account.withdraw(money);
		System.out.println(account.getBalance());
		
		money= 600;
		account.withdraw(money);
	
	}

}
