package multiple;

public class Delivery implements Amazon,Flipkart{
	
	public void Products() 
	{
		String a = "Vivo P45";
		System.out.println(a);
	} 
	
	public void Order()
	{
		System.out.println("Cash on delivery");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Delivery obj = new Delivery();
		obj.Products();
		obj.Order();
	}

}
