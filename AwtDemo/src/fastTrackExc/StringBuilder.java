package fastTrackExc;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello"+"\n");
		for(int i=0;i<=10;i++) {
		
			sb.append(i+"\n");
		}
		//System.out.println(sb);
		String s=new String(sb);
		System.out.println(s);
	}

}
