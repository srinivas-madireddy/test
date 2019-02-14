package bankAccounts;

public class TestBank {

	public static void main(String[] args) {
		BankAccount b[] = new BankAccount[4];
		b[0] = new CurrentAccount();
		b[1] = new SavingsAccount();
		b[2] = new BankAccount();
		b[3]= new PlatinamCard();
		for (int i = 3; i < b.length; i++) {
			
			b[i].getType();
			b[i].getAmount();
			
			b[i].getWithdrawl();
			
			b[i].getCredit();
		}
	}

}
