package Day7;

import java.util.*;

public class T2 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = s.nextLine();
		TreeSet <Character> hs = new TreeSet<>();
		for (int i = 0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
		}
		System.out.println("character without repetation");
		System.out.println(hs);
		
		
	}
}
