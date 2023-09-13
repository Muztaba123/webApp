package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp emp=null;
		
		try {
			FileInputStream fis=new FileInputStream("F:\\fileCheck\\text.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			emp=(Emp) ois.readObject();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Deserialization");
			System.out.println("Name:"+emp.name);
			System.out.println("Address:"+emp.address);
		}
	}

	}


