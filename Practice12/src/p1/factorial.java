package p1;

public class factorial {
	public static void main(String[] args) {
	     
		int n=5;
		print(1,5,0);
		
		
	  
	    }
	
	public static void print(int i,int n,int sum)
	{
	if(i==n)
	{
		return;
	}
	     sum=sum+i;
	    print(i+1,n,sum);
	   System.out.println(sum);
	
	
	
}


}
