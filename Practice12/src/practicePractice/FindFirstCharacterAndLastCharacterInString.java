package practicePractice;

public class FindFirstCharacterAndLastCharacterInString {

	public static void main(String[] args) {  
		
		String str="muztaba";
		System.out.println("length:"+str.length());
		//m=0 u=1 z=2 t=3 a=4 b=5 a=6
		
		
		char firstChar=str.charAt(0);
		System.out.println("fisrt character:"+firstChar);
		
		char lastChar=str.charAt(str.length()-1);
		System.out.println("fisrt character:"+lastChar);
	}

}
