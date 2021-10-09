package Day7;

import java.util.*;

public class H1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<>();
		h.put(100, "raju");
		h.put(102,"laila");
		h.put(101, "shreya");
		
		System.out.println(h);
		
		h.remove(100);
		System.out.println(h);
		
		if(h.containsKey(101))
		{
			System.out.println(h.get(102));
		}
		System.out.println(h.size());
		
		TreeMap <Integer,String> t = new TreeMap<>(h);
		System.out.println(t);

	}

}
