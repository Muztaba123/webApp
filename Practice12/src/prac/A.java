package prac;



public class A {
	
	
	
	public static void main(String args[])
	{
		Threadmodul t1=new Threadmodul();
		t1.start();
		
		synchronized (t1) {
			
			try {
				t1.wait();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		System.out.println(t1.balance);
		
		
		
	}
}
