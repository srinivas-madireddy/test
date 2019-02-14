package flight;

public class test {

	public static void main(String[] args) {
		
		Flight f = new Flight(102032,"spicejet");
		pilot p = new pilot("ramesh",f);
		p.flightdetails();
	}

}
