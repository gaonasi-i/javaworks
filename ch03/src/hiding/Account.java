package hiding;

public class Account {
	//맴버변수, 생성자, 메서드 - 구성요소 
	// 메서드 -> 필수요소
	private String ano;     //계좌번호
	private String owner;   //계좌주
	private int balance;     //잔고
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//private에 접근하기 위한 메서드 : get + 멤버변수이름()
	public String getAno() {
		return ano;  //자료형을 보내줌
	}
	public void setAno(String ano) {
		this.ano = ano;  
	}

	//----------------------------------
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;  
	}
	
	//----------------------------------
	
	public int getBalance() {
		return balance;  
	}
	public void setBalance(int balance) {
		this.balance = balance;  
	}
}
