package practicePractice;

public class CheckRotation {

	public static void main(String[] args) {
		
		String str="ABCDM";//ABCDABCD
		String check="CDABN";
		boolean check2 = check(str,check);
		System.out.println(check2);

	}
	
	
	static boolean check(String s1,String s2)
	{
		
		
		for(int j=0;j<s1.length();j++)
		for(int i=0;i<s2.length();i++)
		{
		if(s1.length()==s2.length()&&s1.charAt(j)==s2.charAt(i))
		{
			return true;
		}
		}
		
		return false;
	}

}
