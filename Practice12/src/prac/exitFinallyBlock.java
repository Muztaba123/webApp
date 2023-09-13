package prac;

public class exitFinallyBlock {
	
	public static void main(String args[])
    {
	
		try
		{
			int n=10/2;
			System.out.println(n);
			System.exit(0);
			
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
		finally {
			
			System.out.println("muztaba");
		}
	}
}
