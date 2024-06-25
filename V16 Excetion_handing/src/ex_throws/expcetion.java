package ex_throws;


public class expcetion 
{
	void T() throws ArithmeticException,NullPointerException,ArrayStoreException
	{
		int a = 10;
		int b = 0;
		int c = a/b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		expcetion obj = new expcetion();
		obj.T();
		
	}

}
