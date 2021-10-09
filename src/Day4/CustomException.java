package Day4;

public class CustomException {

	public static void main(String[] args)
	{
		int a=15;
		int b=10;
		if(a>b)
		{
			throw new ArithmeticException("manually throw");
		}
		else
		System.out.println("no exception");
	}

}
