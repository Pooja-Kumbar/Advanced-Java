package Day6;

import java.util.ArrayList;

public class foreach {

	public static void main(String[] args) 
	{
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30); 
		ls.add(40);
		
		int sum = 0;
		for(Object o : ls)
		{
			int temp = (Integer)o;
			sum  = sum + temp;
		}
		System.out.println(sum);
	}

}
