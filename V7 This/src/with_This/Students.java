package with_This;

public class Students {

	String a;
	int b;
	
	void Topers(String a,int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println(a+" "+b);

	}
	
	void Marks()
	{
		System.out.println(a+" "+b);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students obj = new Students();
		obj.Topers("Ak",568);
		obj.Marks();
	}

} 
