package Customer;

public class Trans {

public	void getCredit(int Amount,int amt){
		
	if (amt < 0) {
		System.out.println("invalid Operation");
	} else if (amt == 0) {
		System.out.println("you had not entered the amount to withdraw");
	} else {
		Amount = Amount + amt;
		System.out.println(Amount + " platinum Account gets crediteed");
	}
}


public void getDebited(int Amount,int amt) {
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
}
