package ex_finally;

public class Finally_with_ex {
	
	
	void F()
	{
		try
		{
		int a = 10;
		int b = a/0;
		
		System.out.println(b);
		
		String c = null;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("correct");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Finally_with_ex obj = new Finally_with_ex();
		obj.F();
	}

}
