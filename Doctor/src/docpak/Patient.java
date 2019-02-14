package docpak;

public class Patient {
	private String name;

			public String getName() {
				return name;
			}
		
			public void setName(String name) {
				this.name = name;
			}

	private int age;
	private boolean isTreated = false;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void viewPatientDetails() {
		System.out.println("patient name is " + name + " and age is " + age);
	}

	void setflag(boolean f) {
		isTreated = f;
	}

	boolean getflag() {
		return isTreated;
	}

}
