package Day7;

import java.util.*;

public class S1 {

	public static void main(String[] args) 
	{
		HashSet h = new HashSet();
		h.add(10);
		h.add(50);
		h.add(90);
		h.add(30);
		h.add(50);
		System.out.println(h);
		
		for(Object o : h)
		{
			int temp = (Integer) o;
			System.out.println(temp);
		}

	}

}
