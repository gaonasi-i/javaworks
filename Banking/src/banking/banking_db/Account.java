package banking.banking_db;

public class Account {
	private String ano;       //계좌 번호
	private String owner;     //계좌주
	private int belance;      //찬고
	
	public Account(String ano, String owner, int belance) {
		this.ano = ano;
		this.owner = owner;
		this.belance = belance;
	}
	
	public String getAno(){
		return ano;
	}
	public String getOwner(){
		return owner;
	}
	public int getBelance(){
		return belance;
	}
	
	//잔고를 저장하는 메서드
	public void setBelance(int belance) {
		this.belance = belance;
	}
}
