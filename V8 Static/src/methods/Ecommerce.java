package methods;

public class Ecommerce {
	
	
	static int z;
	
	void Headphones()
	{
		System.out.println("sony");
		System.out.println("samsung");
		System.out.println("boat");
		System.out.println("boult");
		
	}
	
	static void card(String M)
	{
		int P = 599;
		z++;
		
		System.out.println(M);
		System.out.println("Price starts@: "+P);
		System.out.println("Count: "+z);
				 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		card("sony");
		card("boat");
	}

}
