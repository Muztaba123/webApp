package practicePractice;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=152;
		int n=num;
		int temp=0;
		
		
		while(num>0)
		{
		temp=(temp*10)+num%10;
		num=num/10;
		}
        if(temp==n)
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
	}

}
