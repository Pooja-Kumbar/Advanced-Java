package Day5;

class T2 implements Runnable 
{ 
	public void run() 
	{
		  System.out.println("hello from run()");
	}
  
}

 class Driver
{
   public static void main(String[] args)
   {
	   Thread t = new Thread( new Thread());
	   Thread t1 = new Thread( new Thread());
	   Thread t2 = new Thread( new Thread());
	   t1.start();
	   System.out.println(t1.getName()+" t1 thread");
	   try
	   {
		   t1.sleep(4000);//4sec
	   }
	   catch(InterruptedException e)
	   {
		   System.out.println("exception is cought");
	   }
	   t2.start();
	   System.out.println(t2.getName()+" t2 thread");
	   t.start();
	   System.out.println(t.getName()+" t3 thread");
	   
   }
}
