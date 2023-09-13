package PracticeJava;

public class PracticeKeyword {
public static void main(String[] args) {
	
	String s1 = "my name is aquib";
	String res = reverse_sentence(s1);
	System.out.println(res);
	  
}
static String reverse_sentence(String s1) {
	String[] ch = s1.split(" ");
	System.out.println(ch);
	String s2 = "";
	String[] temp = new String[ch.length];
	for(int i=0; i<ch.length; i++) {
		String s = "";
		String ele = ch[i];
		for (int j=ele.length()-1; j>=0; j--) {
			s += ele.charAt(j);
		}
		temp[i] = s;
	}
	for(String s : temp) {
		s2 += s + " ";
	}
	return s2;
}
}
	
	
	