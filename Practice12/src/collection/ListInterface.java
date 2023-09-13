package collection;

import java.util.*;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String>  st=new ArrayList<>();
		st.add("Muztaba Ahmad");
		st.add("Sonu Ahnad");
		st.add("Tanzeel Zeya");
		st.add("Saif Ahnad");
		st.add("Sarfaraz Ahnad");
		st.add(null);
		
//		System.out.println(st);
//		st.add(1,"aquib");
//		System.out.println(st);
//		st.remove(1);
//		System.out.println(st);
//		System.out.println(st.contains("Muztaba Ahmad"));
//		Collections.sort(st);
//		System.out.println(st);
		
		Iterator itr=st.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
