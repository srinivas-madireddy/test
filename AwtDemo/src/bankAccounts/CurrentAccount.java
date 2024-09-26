package bankAccounts;

public class CurrentAccount extends BankAccount {
	public void  getType() {
		System.out.println("you have no interest.....");
		 
	}
	public void getAmount() {
		
		if(Amount>=15000) {
			System.out.println("Your are having good enough balance"+Amount);
			
		}
		else if(Amount<=15000 & Amount>=10000) {
			System.out.println("you have enough money to stay"+"\n"+Amount);
		}
		else {
			System.out.println("\n"+"You have to earn more money to servive"+Amount);
		}
	}
	public void getWithdrawl() {
		System.out.println("min withdral amount is 50000");
		
	}
	public void getCredit() {
		System.out.println("Current account should credit min of 10000");
	}
}
