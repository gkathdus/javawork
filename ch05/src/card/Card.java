package card;

public class Card {
	private static int serialNum = 10000; // 클래스 변수
	private int cardNumber; // 인스턴스 변수
	
	public Card() {
		serialNum++;
		cardNumber = serialNum;
	
	}
	
	public int getCardNumber() {
		return cardNumber;
	}

}
