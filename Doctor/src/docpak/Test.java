package docpak;

public class Test {

	public static void main(String[] args) {

		Patient[] p = new Patient[10];
		p[0] = new Patient("raju", 22);
		p[1] = new Patient("vinay", 25);
		p[2] = new Patient("keshore", 60);
		p[3] = new Patient("ramesh", 42);
		p[4] = new Patient("jeeva", 26);
		p[5] = new Patient("sati", 33);
		p[6] = new Patient("azam", 22);
		p[7] = new Patient("sagar", 44);
		p[8] = new Patient("pranav", 33);
		p[9] = new Patient("naveen", 31);

		Doctor d = new Doctor("Ramesh");
		System.out.println(" -----------------------------DOCTOR DETAILS----------------------------");
		d.docterDetails();
		System.out.println(" -----------------------------PATIENT DETAILS----------------------------");
		for (int i = 0; i < 10; i++) {
			p[i].viewPatientDetails();
			d.isTreated(p[i]);
			d.doTreatment(p[i]);
			d.isTreated(p[i]);
			System.out.println(" -----------------------------NEXT PATIENT----------------------------");

		}

	}

}
