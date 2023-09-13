package PracticeJava;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=123;
		int n=num;
		int sum=0;
		
		while(n>0)
		{
			sum=(sum*10)+n%10;
			n=n/10;
			
		}
		
		if(sum==num)
		{
			System.out.println("it is palindrom number");
		}
		else
		{
			System.out.println("it is not palindrom number");	
		}

	}

}
