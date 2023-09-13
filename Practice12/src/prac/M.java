package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public abstract class M {
	
	
	public static void main(String[] args) {
		
		
//		List<Integer> list=Arrays.asList(1,2,3,4,5);
//	    
//		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println(collect);
//		
//		List<Integer> collect2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		
//		List<Integer> list1=Arrays.asList(1,2,3,4,5);
//		
//		Collections.reverse(list1);
//		
//		System.out.println(list1);
		
		
		ArrayList<Integer> al=new ArrayList<>();
		
		System.out.println(al.size());
		
		
	
		
	ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
	
	//chm.put(null, null);
	//System.out.println(chm);
	
	
	
	HashMap<Integer, String> hm=new HashMap<>();
	
	hm.put(null, null);
	System.out.println(hm);
		
	}
	
}
