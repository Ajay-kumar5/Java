package methods;

public class Demo {
	 
	int B = 60;
	static int  M = 20;
	
	void Studs()
	{
	
		System.out.println("Students");
		
	}
	
	static void Display()
	{
		 int C = 40;
		M++;
		
		System.out.println("Mens: "+M);
		System.out.println("Girls: "+C);
		//System.out.println("Total: "+B);   Non-static variable cannot be declared
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display();
		Display();
	}

}
