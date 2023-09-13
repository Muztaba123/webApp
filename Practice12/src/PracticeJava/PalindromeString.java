package PracticeJava;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="madam";
		String s=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("it is palindrome number");
		}
		else
		{
			System.out.println("it is not palindrome number");
		}
	}

}
