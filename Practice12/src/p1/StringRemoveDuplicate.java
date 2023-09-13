package p1;

public class StringRemoveDuplicate {

	public static void main(String[] args) {
		
		String str="aaaaaaaaaabbbbbbbbbbbbbbbbbbcccccccccccccccddddddddddddddddd";
		char ch;
		String newString="";
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(newString.indexOf(ch)==-1)
			{
				newString+=ch;
			}
		}
		
		final int i;
		
		System.out.println(newString);
		
	}
	
	
}
