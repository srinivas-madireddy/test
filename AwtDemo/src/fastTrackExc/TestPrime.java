package fastTrackExc;

import java.util.ArrayList;
import java.util.List;

public class TestPrime {

	public static void main(String[] args) {
		List<Prime> l=new ArrayList<Prime>();
		l.add(new Prime(1,"hanup",23,2000.00));
		l.add(new Prime(2,"kumar",22,1500.00));
		l.add(new Prime(3,"talasila",21,2500.00));
for(Prime p:l) {
	System.out.println(p.getId()+"\n"+p.getName()+"\n"+p.getAge()+"\n"+p.getSalary());
	System.out.println();
}
	}

}
