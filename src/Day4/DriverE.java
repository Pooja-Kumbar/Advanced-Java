package Day4;

class NotValidException extends Exception
{
     NotValidException(String s)
     {
    	 super(s);
     }
}

class DriverE
{
	public static void main(String[] args) throws NotValidException
	{
		try
		{
			throw new NotValidException("custom");
		}
        catch(NotValidException e)
		{
        	System.out.println("Custom exception is handled");
        	//throw e;//not handled
		}
		
	}
}

