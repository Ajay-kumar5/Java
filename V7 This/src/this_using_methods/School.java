package this_using_methods;

public class School {
	
	void Students()
	{
		System.out.println("Ajay");
	}
	
	void Mark()
	{
		this.Students();
		Students();
		System.out.println("Mark: 588");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School obj = new School();
		obj.Mark();
	}

}
