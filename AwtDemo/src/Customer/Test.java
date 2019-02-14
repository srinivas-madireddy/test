package Customer;

public class Test {

	public static void main(String[] args)  {
		Customer hanup = new Customer("Hanupkumar", "Cg-099", new Platinum());
		Customer sharu = new Customer("Sharu");
		Customer c3 = new Customer();
		Customer azam = new Customer("Azam", new Current());
		Customer srinivas = new Customer();
		
		hanup.deposit(2000);
		hanup.withdraw(3000);

		c3.deposit(1000);
		c3.withdraw(1000);
		
		
		azam.deposit(2000);
		azam.withdraw(1500);
		
		
		sharu.deposit(5000);
		sharu.withdraw(3050);
		
		
		srinivas.deposit(500);
		srinivas.withdraw(2000);
		
		
		

	}

}