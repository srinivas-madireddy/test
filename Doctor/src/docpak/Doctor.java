package docpak;

public class Doctor {
	String docName;

	Doctor(String name) {
		this.docName = name;
	}

	void doTreatment(Patient p1) {
		System.out.println(p1.getName() + " is treateed");
		p1.setflag(true);
	}

	void isTreated(Patient p) {
		String pName = p.getName();
		if (p.getflag() == true) {
			System.out.println("Yes " + pName + " is  treated");
		} else {
			System.out.println("No " + pName + " is not treated");
		}
	}

	void docterDetails() {
		System.out.println(docName + " is docter name");
	}
}
