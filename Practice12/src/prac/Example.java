package prac;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
	   public static void main(String argu[]) {
	     
		   int ar[]= {8,7,8,5,9,6,6,3,7};
		  
		  
		   List<Integer> ts=new ArrayList<Integer>();
		   
		   for(int i=0;i<ar.length-1;i++)
		   {
			  ts.add(ar[i]); 
		   }
		   System.out.println(ts);
		   Collections.sort(ts);
		   System.out.println(ts);
		  
	   }
}