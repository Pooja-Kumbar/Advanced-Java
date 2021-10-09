package Day6;

import java.util.*;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList ls = new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		int key = 20;
		System.out.println(ls.contains(key));//true
		System.out.println(ls.indexOf(key));//1
		System.out.println(ls.isEmpty());//true
		System.out.println(ls.size());//0
	}

}
