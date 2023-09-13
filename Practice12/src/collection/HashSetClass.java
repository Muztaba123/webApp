package collection;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {


		HashSet  hs=new HashSet<>();
		
		hs.add(null);
		hs.add(null);
		hs.add("muztaba ahmad");
		hs.add("muztaba ahmad");
		hs.add(101);
		hs.add(10.0);
		hs.add(true);
		
		System.out.println(hs);
		boolean contains = hs.contains(101);
		System.out.println(hs.equals(hs));
	}

}
