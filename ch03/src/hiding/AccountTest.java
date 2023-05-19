package hiding;

public class AccountTest {

	public static void main(String[] args) {
		//계좌 객체 생성
		Account a1 = new Account("1000-1234", "이가은", 50000);
		Account a2 = new Account("1000-4567", "이영원", 30000);
		
		//System.out.println(a1.getAno());  //함수로 접근
		a1.setAno("2000-1234");           //수정
		//System.out.println(a1.getAno());  //출력
		
		System.out.println("계좌번호: " + a1.getAno());
		System.out.println("예금주: " + a1.getOwner());
		System.out.println("잔액: " + a1.getBalance() + "원");
		
		System.out.println();
		
		System.out.println("계좌번호: " + a2.getAno());
		System.out.println("예금주: " + a2.getOwner());
		System.out.println("잔액: " + a2.getBalance() + "원");
	}

}
