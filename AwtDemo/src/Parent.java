import java.util.Scanner;
public class Parent {
	int a,b,c;
	Scanner s=new Scanner(System.in);
public int getAdd() {
	
	a=s.nextInt();b=s.nextInt();
	 c=a+b;
	return c;
}
public int getSub() {
	a=s.nextInt();b=s.nextInt();
	c=a-b;
	return c;
	
}
}
