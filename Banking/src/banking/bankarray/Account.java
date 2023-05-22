package banking.bankarray;

public class Account {
	private String ano;
	private String owner;
	private int belance;
	
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
}
