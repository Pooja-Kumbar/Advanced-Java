package Day4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CheckedPropogation {

	public static void main(String[] args) throws FileNotFoundException//calling
	{
		test();
	}
    public static void test() throws FileNotFoundException//called
    {
    	new FileOutputStream("e:f1");
    }
}
