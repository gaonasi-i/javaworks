package singleton.card;

public class CardCompany {
	private static CardCompany instance;
	
	//생성자
	private CardCompany() {}
	
	//메서드
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	//카드 생산
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
