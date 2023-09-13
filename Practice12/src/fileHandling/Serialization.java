package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		
		Emp emp=new Emp();
		emp.name= "muztaba ahmad";
		emp.address= "subhash chowk";
		
		try {
			FileOutputStream fos=new FileOutputStream("F:\\fileCheck\\text.txt",true);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			fos.close();
			System.out.println("serialized data is saved in text file");
			}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		


	}
}
