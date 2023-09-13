package practicePractice;

public class PalindromeString {
	
	public static void main(String[] args) {
		
	
	String str="madam";
	String s=str;
	String temp = "";
	
	
	for(int i=str.length()-1;i>=0;i--)
	{
		temp+=str.charAt(i);
	}
	
	if(s==temp)
	{
		System.out.println("it is palindrome");
	}
	else
	{
		System.out.println("it is not palindrome");
	}
	}

}
