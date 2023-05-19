package classpart;

import hiding.Account;

public class AccontTest {

	public static void main(String[] args) {
		Account a3 = new Account("1000-9999", "가오나시", 23900);
		
		System.out.println(a3.getAno());
		System.out.println(a3.getOwner());
		System.out.println(a3.getBalance());

	}

}
