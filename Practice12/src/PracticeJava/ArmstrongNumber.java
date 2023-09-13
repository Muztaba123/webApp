package PracticeJava;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		int num=153;
		int n=num;
		int r ;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum+=r*r*r;
			n=n/10;
			
		}
		
		if(num==sum)
		{
			System.out.println("this value is Armstrong number");
		}else
		{
			System.out.println("this value is not Armstrong number");
		}

	}

}
