package fileio;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class WriteDemo {

	public static void main(String[] args) throws IOException {
		 FileReader fr=new  FileReader ("D:\\Akshay\\myfile.txt");
          FileOutputStream out=new FileOutputStream("D:\\Akshay\\myak.txt");
          int i;
          while((i=fr.read())!=-1) {
        	  out.write(i);
          }
	}

}
