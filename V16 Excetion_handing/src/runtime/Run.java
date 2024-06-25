package runtime;

public class Run {
	
	void R()
	{
		int[] a = {10,55,20,30,40};
		
		for(int i = 0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	
	void login()
	{
		try {
			
		int a = 10;
		int b = a/0;
		
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	void Dis()
	{
		try
		{
		System.out.println("hello");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args)
	{
		Run obj = new Run();
		//obj.R();
		obj.login();
		obj.Dis(); 
	}
}
