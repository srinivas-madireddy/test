package bankAccounts;

public class SavingsAccount extends BankAccount {

	public void  getType() {
		System.out.println("you have less interest.....");
		
	}
	public void getAmount() {
		
		if(Amount>=45000) {
			System.out.println("Your are having good enough balance"+Amount);
			
		}
		else if(Amount<=45000 & Amount>=20000) {
			System.out.println("you have enough money to stay "+Amount);
		}
		else {
			System.out.println("You have to earn more money to servive"+Amount);
		}
	}
public void getWithdrawl() {
	System.out.println("min withdral amount is 10000");
	
}
public void getCredit() {
	System.out.println("Savings account should credit min of 5000");
}

}
