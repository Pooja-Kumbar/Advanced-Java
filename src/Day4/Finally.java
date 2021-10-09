package Day4;

class NotValidException extends Exception
{
	NotValidException()
	{
		
	}
     NotValidException(String s)
     {
    	 super(s);
     }
}

class Finally {

	public static void main(String[] args)
	{
		try
		{
			int c = 10/0;
		}
        catch(ArithmeticException e)
		{
        	
		}
		finally
		{
			System.out.println("finally");
		
		}
	}

}

