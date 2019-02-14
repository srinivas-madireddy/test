package fastTrackExc;

public class Prime {
	private int ID;
	private String name;
	private int age;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return ID;
	}
	public void setId(int i) {
		this.ID=i;
	}
	
	Prime(int i,String name,int age,double d){
		this.ID=i;
		this.name=name;
		this.age=age;
		this.salary=d;
	}

}
