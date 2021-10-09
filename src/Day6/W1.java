package Day6;

public class W1 {

	public static void main(String[] args)
	{
		int a = 10;
		
		Integer b = Integer.valueOf(a);
		System.out.println(b);//10
		System.out.println(b.toString());//10
		
		byte c =2;
		Byte c1 = Byte.valueOf(c);
		System.out.println(c1);//2
		
		boolean d = true;
		Boolean d1 = Boolean.valueOf(d);
		System.out.println(d1);
		
		int e = 30;
		Integer e1 = e;//compiler-1.1 version-autoboxing
		System.out.println(e1);

	}

}
