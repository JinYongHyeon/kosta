package dddddd;

public class Buyer {
	private int money = 1000;
	private int bounsPoint = 0;
	private Buyer[] buyer;
	private int point;

	public Buyer() {
		
	}
	public Buyer(int i) {
		money -= i;
	}

	public void buy(Buyer b) {
		if (money < 0) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			System.out.println(b + "�����Ͽ����ϴ�.");
			buyer[point++] = b;
		}
	}

	public void summary() {
		for (int i = 0; i < buyer.length; i++)
			System.out.print(buyer[i]);
	}

	public void refund(Buyer b) {
		for (int i = 0; i < buyer.length; i++) {
			if (b instanceof Computer) {
			
			}
		}
	}

}
