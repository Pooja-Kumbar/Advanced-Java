package Day6;

public class W4 {

	public static void main(String[] args) 
	{
		int a = 30;
		String s = String.valueOf(a);
		System.out.println(s);//30

		
		s = s+20;
		System.out.println(s);//3020
		System.out.println("===================");
		
		char c = 'a';
		
		String s1 = String.valueOf(c);
		System.out.println(s1);//a
		
		System.out.println("===================");
		
		boolean b = true;
		String s2 = String.valueOf(b);
		System.out.println(s2);//true
		
		System.out.println("===================");
		
		String s3 = "100";
		
		int a1 = Integer.parseInt(s3);
		System.out.println(a1);//100
		System.out.println("===================");
		
		String s4 = "hello";
		char c1 = s4.charAt(0);
		System.out.println(c1);//converting str to char
		System.out.println("===================");
	}

}
