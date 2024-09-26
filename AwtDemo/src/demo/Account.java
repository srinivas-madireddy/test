package demo;

public class Account {
	private int balance;
	
	Account(){
		balance = 0;
	}
	
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	int getBalance() {
		return balance;
	}
	

}
