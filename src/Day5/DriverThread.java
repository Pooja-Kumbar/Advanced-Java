package Day5;

class Demo extends Thread
{
	Demo(String s)
	{
		super(s);
	}
}

public class DriverThread {

	public static void main(String[] args)
	{
		Demo d = new Demo("Thread1");
		System.out.println(d.getName());
		System.out.println(d.getId());
		System.out.println(d.getPriority());//default

		
	}

}

