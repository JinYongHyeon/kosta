package step1.review;
/*
 * �޼��忡 ���ϰ��� ���� �� void�� ����� ����� ����, �޼��忡 ����Ÿ���� ��õǰ� ���ϰ��� ���� �� ���Ǵ� ����� Ư¡�� �����ϴ� ����
 */
class Atm{
	int money =100;
	//�Ա��ϴ� �޼��� - ���ϰ��� �ʿ䰡 �����Ƿ� void�� ����
	public void deposit(int money) { 
		this.money += money; 
	}
	
	//����ϴ� �޼��� - ���ϰ��� �ʿ�(���� ����ؾ� �ϴϱ�) , money�� type�� int�̹Ƿ� void ��� ���ϰ��� ���� ����Ѵ�.
	public int withdraw(int money) {
		this.money-=money;
		return money;
	}
}

public class TestATM {
	
	public static void main(String[] args) {
		Atm atm = new Atm();
		//���� 200�� �Ա��Ѵ�.
		atm.deposit(200); //void �޼���� �����ϰ� ��ȯ���� ����
		//void �̹Ƿ� return value �� �����Ƿ� ��ºҰ� error
		//System.out.println(atm.deposit(200));
		System.out.println(atm.money);
		//���� ���� ����Ѵ�
		int m =atm.withdraw(200);//���ϰ��� �����Ƿ� ��ݾ��� ��ȯ�޾� ������ ����
		System.out.println("ATM��⿡�� ����� ���׼� : "+m);
		
	}
}
