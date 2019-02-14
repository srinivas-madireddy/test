package Customer;

public class Savings extends Account {
	int Amount = 1000;
	String type="Savings";
	//Trans t=new Trans();
	
	Savings() {
		Amount = 1000;
		
	}
	
	public void getCredit(int amt) {
		
		//t.getCredit(this.Amount, amt);
		if (amt < 0) {
			System.out.println("invalid Operation");
		} else if (amt == 0) {
			System.out.println("you had not entered the amount to credit");
		} else {
			Amount = Amount + amt;
			System.out.println(Amount + " Savings Account credited");
		}

	}

	public void getDebited(int amt) {
		//t.getDebited(this.Amount, amt);
		if (Amount < amt) {
			System.out.println("you does not have sufficent balance");
		} else if (amt < 0) {
			System.out.println("Operation is not possible");
		} else if (amt == 0) {
			System.out.println("you had not entered the amount to withdraw");
		} else {
			Amount = Amount - amt;
			System.out.println(Amount + " Savings Account debited");
		}
	}

	public void viewBal() {
		System.out.println("Savings Account balance is: " + Amount);
	}
}
