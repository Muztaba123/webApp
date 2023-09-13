package practicePractice;

public class RemoveEachWordInString {

	public static void main(String[] args) {
	
		String str="muztaba ahmad sonu";
		String[] words=str.split(" ");
		String reverse="";
		
		for(String word:words)
		{
			String reverseWord="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseWord+=word.charAt(i);
			}
			reverse+=reverseWord+" ";
			
		}
		
		System.out.println(reverse);
		
	}

}
