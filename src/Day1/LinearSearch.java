package Day1;

public class LinearSearch {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70};
		int key = 90;
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if(key ==a[i])
			{
				System.out.println("Key value is found");
				flag=true;
				break;
			}
		}
        if(flag==false)
        {
        	System.out.println("Key value is not found");
        }
	}

}
