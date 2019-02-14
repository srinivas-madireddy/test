package Customer;

public class Customer {

	 private String name;
	 private String id;
	private Account a;
	Customer() {
		this("new Customer", "CG-00", new Savings());
	}

	Customer(String name) {
		this(name, "CG-00", new Savings());
	}

	Customer(String name, Account a) {
		this(name, "CG-00", a);
	}

	Customer(String name, String id, Account a) {
		this.name = name;
		this.id = id;
		this.a = a;
	}
	void withdraw(int amt) {
		a.getDebited(amt);
	}

	void deposit(int amt) {
				a.getCredit(amt);
	}
	void remove() {
		a=null;
		System.out.println(name+"  Accounts get deleted");
		a.deleteAcc();
		
	}

	public void getName() {
		System.out.println(name);
		
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
		
	}

	public void getId() {
		System.out.println(id);
		
	}

	public void setId(String id) {
		this.id = id;
		System.out.println(id);
	}
	
	
}