package flight;

public class pilot {
	Flight f1;
	String name;
	pilot(String name,Flight f1){
		this.name= name;
		this.f1 = f1;
	}
	void flightdetails(){
		System.out.println(name+" is the pilot for the flight number "+f1.fnum+ " of "+f1.airways+" airways");
	}

}
