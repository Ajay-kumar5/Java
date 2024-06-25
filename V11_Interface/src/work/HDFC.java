package work;

public class HDFC implements RBI{
	
	public void carloan()
	{
		System.out.println("car loan upto Rs.45000");
	}
	
	public void Bikeloan()
	{
		System.out.println("Bike loan upto Rs.200000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFC obj = new HDFC();
		obj.Bikeloan();
		obj.carloan();
	}

}
