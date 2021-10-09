package Day6;

import java.util.*;

public class sort {

	public static void main(String[] args)
	{
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add(5);
		ls.add(50); 
		ls.add(15);
		
		System.out.println("before sorting");
		System.out.println(ls);
	
		System.out.println();
		Collections.sort(ls);
		System.out.println("after sorting in ascending");
		System.out.println(ls);
		
		System.out.println();
		Collections.reverse(ls);
		System.out.println("after sorting in descending order");
		System.out.println(ls);
		

	}

}
