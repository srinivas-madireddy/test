package Customer;

public class Current extends Account {
	int Amount;
	String type="Current";
	//Trans t=new Trans();
	Current() {

		Amount = 2000;
	}

	public void getCredit(int amt) {
		//t.getCredit(this.Amount, amt);
		if (amt < 0) {
			System.out.println("invalid Operation");
		} else if (amt == 0) {
			System.out.println("you had not entered the amount to withdraw");
		} else {
			Amount = Amount + amt;
			System.out.println(Amount + " Current Account gets Credited");
		}

	}

	public void getDebited(int amt) {
		//t.getDebited(this.Amount, amt);
		if (Amount < amt) {
			System.out.println("you does not have sufficent balance");
		} else if (amt < 0) {
			System.out.println("invalid Operation");
		} else if (amt == 0) {
			System.out.println("you had not entered the amount to withdraw");
		} else {
			Amount = Amount - amt;
			System.out.println(Amount + " Current Account gets debited");
		}
	}

	public void viewBal() {
		System.out.println(" Current Account balance is:   " + Amount);
	}
}
