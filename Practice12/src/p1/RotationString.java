package p1;

public class RotationString {

	public static void main(String[] args) {
		
		String str="ABCD";//ABCDABCD
		String check="CDMB";
		
		if(str.length()==str.length()&&(str+str).contains(check))
		{
			System.out.println("Rotation happen");
		}
		else
		{
			System.out.println("Rotation not happen");
		}

	}
	
	

}
