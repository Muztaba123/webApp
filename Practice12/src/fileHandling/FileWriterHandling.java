package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHandling {

	public static void main(String[] args) {
		
		FileWriter fw;
		try {
			fw = new FileWriter("F:\\fileCheck\\text.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("muztaba ahmad sonu");
			bw.newLine();
			bw.write("saif ahmad");
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
