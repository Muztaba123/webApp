package practicePractice;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num=154;
		int n=num;
		int sum=0;
		
		
		while(n>0)
		{
			int r=n%10;
			
			sum+=r*r*r;
			n=n/10;
			
		}
		
		if(sum==num)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
		
		
	}

}
