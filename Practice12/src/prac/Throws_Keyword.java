 package prac;
 import java.util.Scanner;

public class Throws_Keyword {

	public static void main(String[] args) {
		
		long balance=50000;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Amount");
		long amount=sc.nextLong();
		
		if(balance>amount)
		{
			System.out.println("please collect the cash");
		}
		
		else {
			
			try {
				
				throw new InsufficientFound();
				
			} catch (InsufficientFound e) {
				
				System.out.println(e);
				System.out.println("low balance");
				
			}
		}
	}

}
