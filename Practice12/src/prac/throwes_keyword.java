package prac;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class throwes_keyword {
	
	public static void main(String[] args) throws IOException, SQLException {
		
		throwes_keyword tk=new throwes_keyword();
		tk.getWriter();
		
	}
 
	public void getWriter() throws IOException, SQLException
	{
		FileWriter fw=new FileWriter("F:\\New folder");
	}
	
	
}
