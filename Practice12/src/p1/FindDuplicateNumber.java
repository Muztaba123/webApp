package p1;

import java.util.Arrays;

public class FindDuplicateNumber {

public static void main(String[] args) {
	    	
	    
           int num=153;
           int r=num;
           int temp=0;
         
	   while(r>0)
	   {
		   int n=r%10;
		   temp+=n*n*n;
		   r=r/10;
		   
	   }
	   
	   System.out.println(temp);
           
		}
}


