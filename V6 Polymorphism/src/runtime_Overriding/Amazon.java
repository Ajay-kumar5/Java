package runtime_Overriding;

public class Amazon {
	
	void Login(String Username,String Password) 
	{
		System.out.println("Amazon "+"Username: "+Username+"  Password: "+Password);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon obj = new Amazon();
		obj.Login("Ajay", "AK585");

		AmazonPrime obj1 = new AmazonPrime();
		obj1.Login("AK", "Kumer458");
	}

}
