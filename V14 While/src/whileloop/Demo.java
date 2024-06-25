package whileloop;

public class Demo {

	
	void D()
	{
		int a =0;
		
		while(a<10)
		{
			System.out.println(a);
			
			a++;
		}
	}
	
	
	void Table()
	{
		
		int b = 1;
		
		int c = 2;
		
		while(b<=10)
		{
			System.out.println(b+"x"+c+'='+b*c);
			
			b++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new Demo();
		//obj.D();
		obj.Table();
	}

}
