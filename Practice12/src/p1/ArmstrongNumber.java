package p1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		
		int num = find(number);
		if(num==number)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
		
		
	}

	
	
	public static int find(int number)
	{
		int length = 0;
		int t1=number;
		int t2=number;
		int temp=0;
		while(t1!=0)
		{
			length=length+1;
			t1=t1/10;
		}
		
		while(t2!=0)
		{ 
			int mul=1;
			int digit=t2%10;
			
			for(int i=0;i<length;i++)
			{
				mul=mul*digit;
			}
			temp=temp+mul;
			t2=t2/10;
			}
		return temp;
	}
}
