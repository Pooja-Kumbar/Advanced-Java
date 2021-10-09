package Day3;

public class Book
{
    String title;
    Book(String title)
    {
    	this.title=title;
    }
	public static void main(String[] args)
	{
		Book b1 = new Book("java");
		Book b2 = new Book("java");
		
		Book b3=b1;
		System.out.println(b1.hashCode()==b2.hashCode());	
		System.out.println(b1.equals(b2));
	}
	public boolean equals(Object o)
	{
		if(this.title==((Book)o).title)
		{
			return true;
		}
		else
			return false;
	}

}
