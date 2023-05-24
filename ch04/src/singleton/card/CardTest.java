package singleton.card;

public class CardTest {
	public static void main(String[] args) {
		//카드 공정 객체 생성
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		Card card2 = company.createCard();
		Card card3 = company.createCard();
		
		//카드 번호 생성
		System.out.println("카드번호-" + card1.getCardNum());
		System.out.println("카드번호-" + card2.getCardNum());
		System.out.println("카드번호-" + card3.getCardNum());
	}
}
