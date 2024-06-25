 package variable;

public class Funds {

	String name;
	int ID;
	static int Count;
	
	
	void Total(String name)
	{
		this.name = name;
		ID++;
		Count++;
		
		System.out.println("Name: "+name);
		System.out.println("Object ID: "+ID);
		System.out.println("Count: "+Count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funds obj= new Funds();
		obj.Total("Ajay");
		obj.Total("Hari");
		obj.Total("Navi");

		Funds obj1 = new Funds();
		obj1.Total("Kumar");
	}

}
