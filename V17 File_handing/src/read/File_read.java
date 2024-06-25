package read;

import java.io.File;
import java.util.Scanner;

public class File_read {

	void F()
	{
		try
		{
			File f = new File("D:\\Java\\Ex.txt");
			
			Scanner a = new Scanner(f);
			
			while(a.hasNext())
			{
				System.out.println(a.next());
			}
		}
		catch
		{
			finally
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
