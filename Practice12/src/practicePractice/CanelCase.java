package practicePractice;

public class CanelCase {

	public static void main(String[] args) {
	
		String str="muztaba_ahmad_sonu";
	    String[] words=str.split("_");
	    String w="";
	    
	    for(String word:words)
	    {
	        String temp="";
	        for(int i=0;i<word.length();i++)
	        {
	            if(i==0)
	            {
	          temp=(word.charAt(i)+"").toUpperCase(); 
	            }
	            else{
	                temp+=(word.charAt(i)+"").toLowerCase();
	            }
	        }
	        w+=temp+" ";
	    }
	    System.out.println(w);
		
		
	    }

	}


