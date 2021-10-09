package Day4;

import java.io.FileOutputStream;

public class FileException {

	public static void main(String[] args)  
	{
		System.out.println("main begin");
		//new FileOutputStream("String");//Checked-file not found exception
		int c=10/0;//unchecked-Arithmetic
		System.out.println("main end");

	}

}
