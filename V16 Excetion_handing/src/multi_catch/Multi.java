 package multi_catch;

public class Multi {
	
	
	void Display()
	{
		try
		{
			String a = null;
			int b = 20;
			int c = b/0;
			System.out.println(c);
			System.out.println(a.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array");
		}
		catch(NullPointerException e)
		{
			System.out.println(e + " Emety");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multi obj = new Multi();
		obj.Display();
	}

}
