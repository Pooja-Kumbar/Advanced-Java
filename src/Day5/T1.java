package Day5;

public  class T1 {

	public static void main(String[] args) 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Thread name ="+name);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().isDaemon());

	}

}
