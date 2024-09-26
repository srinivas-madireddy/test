
public class Sum {

public int Add(int a,int b){
		return a+b;
	}
public int Add(int a,int b,int c){
	return a+b+c;
}
public int Add(int a,int b,int c,int d){
	return a+b+c+d;
}
	public static void main(String[] args) {

Sum s=new Sum();
System.out.println(s.Add(1, 4));
System.out.println(s.Add(1, 3, 5));
System.out.println(s.Add(1, 6, 1, 4));

	}

}
