package prac;

import java.util.Scanner;

public class Atm_Example {

	
	
	public static void main(String[] args) {
		int balance=12000;
		int pin=212345;
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		System.out.println("if you take case in atm so click 'yes'");
		String login=sc.next();
		
		if(login.equals("yes")) {
			
			System.out.println("please enter your pin");
			int loginpin=sc.nextInt();
			
			if(pin==loginpin)
			{
				try
				{
				System.out.println("please enter  case");
				int amount=sc.nextInt();
				if(amount<=balance)
				{
					System.out.println("plaese collect your case");
				
				}
				else {
					System.out.println("your balance in inufe");
				}
				}catch(Exception e)
				{
				e.printStackTrace();
				}
				}
				
				
			}
			
			
		
		
		
		

	}

}
