package p1;

public class CamelCase {

	public static void main(String[] args) {
		
		String str="muztaba ahmad sonu";
	   String camelCase = camelCase(str);
		System.out.println(camelCase);
     
	}
	
	
	static String camelCase(String str)
	{
		
		String [] words=str.split(" ");
		 String CamelCase="";
	   for(String word:words)
	   {
		   String temp="";
		   for(int i=0;i<word.length();i++)
		   {
			   if(i==0)
			   {
				 temp=(word.charAt(i)+"").toUpperCase();  
			   }
			   else
			   {
				   temp+=(word.charAt(i)+"").toLowerCase();
			   }
		   }
		   CamelCase+=temp+" ";
		  
	   }
		
	   
	   return CamelCase;
	}
	
	

}
