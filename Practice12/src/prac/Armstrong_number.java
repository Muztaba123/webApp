package prac;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any number");
		int num=sc.nextInt();
		
		int n=num;
		int r;
		int sum=0;
		
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		
		if(sum==num)
		{
			System.out.println("It is  Armstrong Number");
		}
		else
		{
			System.out.println("It is not  Armstrong Number");

		}
		
	}

}
