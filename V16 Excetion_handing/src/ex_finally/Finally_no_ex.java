package ex_finally;

public class Finally_no_ex {

	void F()
	{
		try
		{
		
		String c = "Ajay";
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
		
		Finally_no_ex ob = new Finally_no_ex();
		ob.F();

	}

}
