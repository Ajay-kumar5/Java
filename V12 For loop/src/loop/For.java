package loop;

public class For {

	void count()
	{
		for(int i =0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	
	void R()
	{
		for(int a=10;a>0;a--)
		{
			System.out.println(a);
		}
	}
	
	void A()
	{
		for(int a=10;a>=0;a--)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		For obj = new For();
		//obj.count();
		obj.R();
		obj.A();
	}

}
