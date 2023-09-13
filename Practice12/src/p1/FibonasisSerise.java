package p1;

public class FibonasisSerise {

	public static void main(String[] args) {
	
		
		int num=11;
		int f1,f2=0,f3=1;
		
		
		for(int i=0;i<num;i++)
		{
			if(f2==0)
			{
				System.out.print(f2);
			}
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}

	}

}
