package sec03;

public class Card {

	private String cardName;
	
	public Card() {
		this("현대");
	}
	
	
	public Card(String cardName) {
		this.cardName = cardName;
	}
	
	public void getCardName() {
		System.out.printf("카드사는 %s입니다.\n", this.cardName);
	}
	
	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("삼성");
		
		card1.getCardName();
		card2.getCardName();
	}

}
