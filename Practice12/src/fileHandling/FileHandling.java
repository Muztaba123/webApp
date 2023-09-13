package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
 
		File f=new File("F:\\fileCheck");
//		
//		boolean exists = f.exists();
//		System.out.println(exists);
//		
//		boolean delete = f.delete();
//		System.out.println(delete);
//		
//		boolean exists2 = f.exists();
//		System.out.println(exists2);
		
//		
//		try {
//			boolean createNewFile = f.createNewFile();
//			System.out.println(createNewFile);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
//		File f=new File("F:\\fileCheck");
//		
//		  boolean mkdir = f.mkdir();
//		  System.out.println(mkdir);
		
		
//		boolean createNewFile = f.createNewFile();
//		System.out.println(createNewFile);
		
		
//		long length = f.length();
//		System.out.println(length);
		
		String[] list = f.list();
		System.out.println(list.length);
		
	}

}
