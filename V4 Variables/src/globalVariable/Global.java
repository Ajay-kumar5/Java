package globalVariable;

public class Global {
	
	int a = 20;
	int b = 30;
	
	void Sum()
	{
		int a = 5;
		int c = (a+b);
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Global obj = new Global();
		obj.Sum();
	}

}
