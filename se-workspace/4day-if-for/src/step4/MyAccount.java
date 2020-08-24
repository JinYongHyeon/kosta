package step4;

public class MyAccount {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("마이너스 ㄴㄴ 돌아가");
			return;
		}
	}

	public void deposit(int money) {
		if (money > 0) {
			this.balance += money;
		} else {
			System.out.println("잘못된 입금액입니다.");
		}
	}

	public void withdraw(int money) {
		if (money < 0) {
			System.out.println("잘못된 출금액입니다.");	
		} else if (this.balance < money) {
			System.out.println("잔액이 부족합니다.");
		} else{
			this.balance -= money;
			
		}
	}

}
