package Customer;

public class Platinum extends Account {
	int Amount;
	String type="Platinum";
	Trans t=new Trans();
	Platinum() {

		Amount = 5000;
	}

	public void getCredit(int amt) {
	//	t.getCredit(this.Amount, amt);
		if (amt < 0) {
			System.out.println("invalid Operation");
		} else if (amt == 0) {
			System.out.println("you had not entered the amount to withdraw");
		} else {
			Amount = Amount + amt;
			System.out.println(Amount + " platinum Account gets crediteed");
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
			System.out.println(Amount + " Platinum Account gets debited");
		}
	}

	public void viewBal() {
		System.out.println(" Platinum Account balance is:  " + Amount);
	}
}
