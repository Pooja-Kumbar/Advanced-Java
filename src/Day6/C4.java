package Day6;

import java.util.*;

class Employee implements Comparable
{
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public int compareTo(Object o)
	{
		Employee temp = (Employee)o;
		if(this.salary==temp.salary)
			return 0;
		else if(this.salary>temp.salary)
			return 1;
		else
			return -1;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(salary);
	}
}

public class C4 {

	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add(new Employee("laila",20000));
		a.add(new Employee("mala",30000));
		a.add(new Employee("sheela",10000));
		
		
		Collections.sort(a);
		System.out.println(a);
		
		for(Object o : a)
		{
			((Employee)o).display();
		}

	}

}
