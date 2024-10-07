package fileio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File file=new File("D:\\Akshay\\myfile.txt");
         FileReader fr=new    FileReader("D:\\\\Akshay\\\\myfile.txt");
        BufferedReader br=new BufferedReader(fr);
         String str;
         while((str= br.readLine())!=null);
         {
      	 System.out.println(str);  
         }
	}

}
