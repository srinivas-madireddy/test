package bankAccounts;

public class PlatinamCard extends BankAccount {
	public void getWithdrawl() {
		System.out.println("min withdral in platinum card sholud be min 50000");
		
	}
	public void getCredit() {
		System.out.println("Platinum account should credit min of 5000");
	}
}
