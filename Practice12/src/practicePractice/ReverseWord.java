package practicePractice;

public class ReverseWord {

	public static void main(String[] args) {
		
	
	String str="ahmad muztaba";
	String s="";
	String[] words=str.split(" ");
	
	for(int i=words.length-1;i>=0;i--)
	{
		s+=words[i]+" ";
	}
	
	System.out.println(s);
	}
}
