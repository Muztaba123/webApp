package PracticeJava;

public class ReverseNumberInEachWord {

	
	public static void main(String[] args) {
		String str ="my name is muztaba";
		
		String[] splitWord=str.split(" ");
		String reverse="";
		
		
		for(String word:splitWord)
		{
		String reverseWord="";
		for(int i=word.length()-1;i>=0;i--)
		{
			reverseWord=reverseWord+word.charAt(i);
		}
		reverse=reverse+reverseWord+" ";
		
		}
		
		System.out.println(reverse);
		
		
	}

}
