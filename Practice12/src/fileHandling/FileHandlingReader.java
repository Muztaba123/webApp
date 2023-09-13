package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReader {

	public static void main(String[] args) {
		
		
		try {
			
			BufferedReader br=new BufferedReader(new FileReader("F:\\\\fileCheck\\text.txt"));
			String data="";
			while((data =br.readLine())!=null)
			{
				System.out.println(data);
			}
			
		
			 
		}
			
		 catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		catch(IOException e)
		{
			
		}
}
	}


