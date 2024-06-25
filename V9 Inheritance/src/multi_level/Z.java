package multi_level;

public class Z extends Y{
	
	void Comform()
	{
		System.out.println("Order placed comformed");
		System.out.println("Order on 12/05/2024");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Z obj = new Z();
		obj.Comform();
		obj.Payment();
		obj.order();
	}

}
