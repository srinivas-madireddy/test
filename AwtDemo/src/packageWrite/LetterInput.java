package packageWrite;
import java.io.*;
public class LetterInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileInputStream fis;
		fis=new FileInputStream("C:\\Users\\pavan\\Desktop\\Hello.txt");
		int c= fis.read();
System.out.println(c);
	}

}
