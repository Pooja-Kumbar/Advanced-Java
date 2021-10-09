package Day6;

public class Unboxing {

	public static void main(String[] args) 
	{
		Integer i = 100;
		
		int i1 = i.intValue();//explicit unboxing
		System.out.println(i1);//100
		
		Character c = 'z';
		char c1 = c.charValue();//explicit unboxing
		System.out.println(c1);//z
		
		Integer d = 90;
		int d1  = d;
		System.out.println(d1);
		
		Boolean b = false; // Auto unboxing
		boolean b1 = b;
		System.out.println(b1);
	}

}
