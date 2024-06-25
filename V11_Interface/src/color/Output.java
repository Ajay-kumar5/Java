package color;

class Output implements Blue,Red {
	
	public void Ligth()
	{
		System.out.println("Ligth");
	}
	
	public void Dark() 
	{
		System.out.println("Dark");

	}
	
	public void Medium()
	{
		System.out.println("Medium");

	}
	
	public void LigthDark() 
	{
		System.out.println("LigthDark");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Output obj = new Output();
		obj.Ligth();
		obj.Dark();
		obj.Medium();
		obj.LigthDark();
	}

}
