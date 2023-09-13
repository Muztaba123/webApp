package prac;

@FunctionalInterface
public interface LamdasExpression {
	
	public void get(int x);

	
	public static void main(String[] args) {
		
		LamdasExpression le=(int x)->
		{
			System.out.println(x);
		};le.get(200);
	}
}  



		
