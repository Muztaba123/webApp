package practicePractice;

public interface LamdasInterface {
	
	public void get(int x);

	public static void main(String[] args) {
	
		LamdasInterface a1=(int x)->
		{
			System.out.println(x);
		};a1.get(1000);

	}

}
