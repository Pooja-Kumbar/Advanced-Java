package Day7;

import java.util.*;

public class A1
{
	public static void main(String[] args)
	{
		ArrayList <Integer> t = new ArrayList<>();
		t.add(20);
		t.add(5);
		t.add(50);
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(50);
		System.out.println("Array List"+t);
		
		TreeSet<Integer> t1 = new TreeSet<>(t);
		System.out.println("Tree Set"+t1);

	}

}
