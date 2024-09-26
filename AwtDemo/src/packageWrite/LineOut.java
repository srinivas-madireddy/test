package packageWrite;
import java.io.*;
public class LineOut {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("D:\\hanup1.txt");
		String s="Hanup Welcomes you";
		byte[] b=s.getBytes();
		fos.write(b);
		fos.close();

	}

}
