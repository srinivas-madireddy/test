package demo;

public class Tester {
	
	public static void main(String[] args) {
		Customer hanup = new Customer("Hanoop Kumar", new CurrentAccount());
		hanup.viewMyBalance();
		hanup.addMoneyToAccount(500);
		hanup.viewMyBalance();
		
		Customer azam = new Customer("Azam Siddique", new SavingsAccount());
		azam.viewMyBalance();
		azam.addMoneyToAccount(10000);
		azam.viewMyBalance();
		azam.takeMoneyFromAccount(6000);
		azam.viewMyBalance();
		
		
		
		
	}

}
