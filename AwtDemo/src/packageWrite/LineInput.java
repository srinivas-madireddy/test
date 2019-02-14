package packageWrite;

import java.io.*;

public class LineInput {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\pavan\\Desktop\\Hello.txt");
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}

		fis.close();
	}

}
