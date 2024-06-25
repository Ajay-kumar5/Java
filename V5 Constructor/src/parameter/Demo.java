package parameter;

public class Demo {
	
	int M = 100;
			
	Demo(int x,int Price)
	{
		System.out.println("Todays Price Rs."+Price+" Discount "+x+"% of the Products");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo(25,299);
	}

}
