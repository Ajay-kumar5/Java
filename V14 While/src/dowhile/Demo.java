package dowhile;

public class Demo {
	
	void Do()
	{
		int a = 0;
		
		do
		{
			System.out.println(a);
			a++;
		}
		while(a<5);
	}
	
	void Table()
	{
		
		int b= 1;
		int c= 2;
		
		do
		{
			System.out.println(b+"x"+c+"="+b*c);
			b++;
		}
		while(b<=10);
	}
	
	public static void main(String[] args) 
	{
		
		Demo obj = new Demo();
		//obj.Do();
		obj.Table();
		
	}
	
	

}
