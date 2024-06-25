package demo;

public class RBI extends ICICbank implements SBI {
	
	void Max_Withdraw()
	{
		System.out.println("Max_Withdraw upto Rs.500000");
	}
	
	void Min_Deposit()
	{
		System.out.println("Min_deposit upto Rs.10000");
	}
	
	public void Timeing()
	{
		System.out.println("10AM to 6PM");
	}

	public  void Leaves()
	{
		System.out.println("2 and 4 Saturday and all sunday");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI obj = new RBI();
		obj.Max_Withdraw();
		obj.Min_Deposit();
		obj.Timeing();
		obj.Leaves();
	}

}
