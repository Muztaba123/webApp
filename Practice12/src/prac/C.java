package prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class C {
	
	public static void main(String args[])
	{
		try {
			FileInputStream fis=new FileInputStream("F://file.ser");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			A a1 =(A) ois.readObject();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
