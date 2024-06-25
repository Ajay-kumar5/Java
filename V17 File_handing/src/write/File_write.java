package write;

import java.io.*;
import java.io.FileWriter;


public class File_write 
{

	void W()
	{
		try
		{
		File f = new File("D:\\Java\\Ex.txt");
		FileWriter fn = new FileWriter(f);
		fn.write("Java is easy");
		fn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] agrs) {
		
		File_write obj = new File_write();
		obj.W();
	}
	
}
