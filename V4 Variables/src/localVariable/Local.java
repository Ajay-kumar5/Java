package localVariable;

public class Local {
	
	void Sum()
	{
		int x= 50;
		int y = 10;
		int s = (x+y);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Local obj = new Local();
		obj.Sum();
	}

}
