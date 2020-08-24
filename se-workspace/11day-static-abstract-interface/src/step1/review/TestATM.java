package step1.review;
/*
 * 메서드에 리턴값이 없을 때 void를 명시한 경우의 사용과, 메서드에 리턴타입이 명시되고 리턴값이 있을 때 사용되는 경우으 특징을 공부하는 예제
 */
class Atm{
	int money =100;
	//입금하는 메서드 - 리턴값이 필요가 없으므로 void로 선언
	public void deposit(int money) { 
		this.money += money; 
	}
	
	//출금하는 메서드 - 리턴값이 필요(돈을 출금해야 하니까) , money의 type이 int이므로 void 대신 리턴값의 형을 명시한다.
	public int withdraw(int money) {
		this.money-=money;
		return money;
	}
}

public class TestATM {
	
	public static void main(String[] args) {
		Atm atm = new Atm();
		//고객이 200을 입금한다.
		atm.deposit(200); //void 메서드는 실행하고 반환값이 없음
		//void 이므로 return value 가 없으므로 출력불가 error
		//System.out.println(atm.deposit(200));
		System.out.println(atm.money);
		//고객이 돈을 출금한다
		int m =atm.withdraw(200);//리턴값이 있으므로 출금액을 반환받아 변수에 저장
		System.out.println("ATM기기에서 출금한 돈액수 : "+m);
		
	}
}
