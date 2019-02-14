package demo;

public class Customer {
	
	private String name;
	private Account acc;
	
	Customer(){
		this("Unnamed", new SavingsAccount());
		
	}
	
	Customer(String custName, Account custAcc){
		name = custName;
		acc = custAcc;
	}
	
	
	void addMoneyToAccount(int amount) {
		acc.deposit(amount);
	}
	
	void takeMoneyFromAccount(int amount) {
		acc.withdraw(amount);
	}
	
	void viewMyBalance() {
		System.out.println(name + " balance is " +acc.getBalance());
	}

}
