package PracticeJava;

public class ReverseStringInWord {
	
	public static void main(String[] args) {
		
		String str="my name is muztaba";
		String[] s=str.split(" ");
		String rev="";
		
		
		for(int i=s.length-1;i>=0;i--)
		{
			rev+=s[i]+" ";
		}
		
		System.out.println(rev);
	}

}
