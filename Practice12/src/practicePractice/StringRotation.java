package practicePractice;

public class StringRotation {

	public static void main(String[] args) {
    String str1="ABCD";//ABCDABCD
    String str2="CDAB";
   
    if(check(str1,str2))
    {
    	System.out.println("Yes" +str2+ "roation of" +str2);
    }
    else
    {
    	System.out.println("No" +str2+ "roation of" +str2);
    }
    
		
	}
	
	public static boolean check(String s1,String s2)
	{
		
		if(s1.length()==s2.length()&&(s1+s1).contains(s2))
		{
			return true;
		}
		
		return false;
		
	}

}
