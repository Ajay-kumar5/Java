package this_using_Constructor;

public class Studs {
	
	Studs()
	{
		this(588);
		System.out.println("Ajay");
		
	}
	
	Studs(int a)
	{
		System.out.println("Mark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studs obj = new Studs();
	}

}
