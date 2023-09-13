package practicePractice;

public class FindMiddleCharachterInString {

	public static void main(String[] args) {
		
		String str="muztaba";
		
		int pos = 0;
		int len=0;
		
		
		if(str.length()%2==0)
		{
		pos=str.length()/2-1;
		len=2;
		System.out.println(str.substring(pos,pos+len));
		}
		else
		{
			pos=str.length()/2;
			len=1;
			
			System.out.println(str.substring(pos,pos+len));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		char[] word=str.toCharArray();
//		
//		
//		int length=word.length/2;
//		System.out.println(length);
//		if(length%2!=0)
//		{
//			System.out.println(word[length-1]+" "+word[length]);
//		}
//		else {
//			
//			System.out.println(word[length]);
//		}
		
		

	}

}
