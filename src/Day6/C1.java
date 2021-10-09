package Day6;

import java.util.*;

public class C1 {

	public static void main(String[] args)
	{
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		System.out.println(ls);
		
		for(int i=0;i<ls.size();i++)
		{
			int temp = (Integer) ls.get(i);
			System.out.println(temp);
		}
	}
	
	

}
