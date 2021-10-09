package Day2;

public class OverrideToString {

	int a=10;
    int b=20;
	public static void main(String[] args) {
		
		OverrideToString s = new OverrideToString();
		OverrideToString s2 = new OverrideToString();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.equals(s2));
	}
	@Override
	public String toString()
	{
		return  ""+"a = "+a+" b = "+b;
	}
    /*public boolean equals(Object obj)
    {
    	
    }*/
}
