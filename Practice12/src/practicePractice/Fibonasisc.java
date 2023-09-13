package practicePractice;

public class Fibonasisc {
	
	public static void main(String[] args) {
		int num=10;
		int f1,f2=0,f3=1;
		
		for(int i=0;i<10;i++) {
			
			if(f2==0)
			{
				System.out.println(f2);
				
			}
			
			System.out.println(f3);
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
			
		}
		System.out.println(f3);
		
	}

}
