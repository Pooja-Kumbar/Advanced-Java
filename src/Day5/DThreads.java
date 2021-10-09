package Day5;

class Threads implements Runnable
{ 
	public void run() 
	{
		  System.out.println("hello from run()");
	}
  
}
class DThreads
{
	public static void main(String[] args)
	{
		//Thread t = new Thread(new Thread(),"abc");
		Thread t = new Thread(new Thread());
		t.start();
	}
}