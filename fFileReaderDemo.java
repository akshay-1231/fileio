package fileio;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fFileReaderDemo {

	public static void main(String[] args) throws IOException {
	 FileReader fr=new  FileReader ("D:\\\\Akshay\\\\myfile.txt");
		 int i=1;
		 while((i=fr.read())!=-1) {
			 System.out.print((char)i);
		 }

	}

}

