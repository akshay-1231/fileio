package fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fis = new FileInputStream("D:\\Akshay\\myfile.txt");
			int k;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
			fis.close();
		}
		
		catch(IOException e) {
			System.out.println("path is wrong");
			System.out.println(e.getMessage());
		}
	
	}
}
