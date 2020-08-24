package step0723;

class StudaDeck {
	final int CARD_NUM = 20;
	int num[] = { 1, 3, 8 };
	int number = 1;

	StudaCard cards[] = new StudaCard[CARD_NUM];

	public StudaDeck() {
		super();
		for (int i = 0; i < cards.length; i++) {
		if(number>10)number=1;
			switch (i) {
			case 0:
				cards[i]= new StudaCard(number++, true);
				break;
			case 2:
				cards[i]= new StudaCard(number++, true);
				break;
			case 7:
				cards[i]= new StudaCard(number++, true);
				break;

			default:
				cards[i]= new StudaCard(number++, false);
				break;
			}

		}
	}

}

class StudaCard {
	int num;
	boolean isKwang;

	public StudaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}

}

public class Exercise7_1 {

	public static void main(String[] args) {
		StudaDeck deck = new StudaDeck();

		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
	}

}
