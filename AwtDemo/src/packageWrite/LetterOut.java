package packageWrite;
import java.io.*;
public class LetterOut {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("D:\\hanup.txt");
fos.write(90);
		fos.close();
	}

}
