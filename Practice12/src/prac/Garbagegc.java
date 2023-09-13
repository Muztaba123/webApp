package prac;

public class Garbagegc {
	
	
	public static void main(String[] args) {
		
		Garbagegc g=new Garbagegc();
		g=null;
		System.gc();
	}
	
	public void finalize()
	{
		System.out.println("100");
	}
}
