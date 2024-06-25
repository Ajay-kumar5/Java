package compile_Overloading;

public class Healthcare {
	
	void Doctor(String name, String Mobile_no)
	
	{
		System.out.println("Doctor: "+name+"  Doctor Mobile No: "+Mobile_no);
	}
	
	void Doctor(int fee)
	{
		System.out.println("Doctor Fees: "+fee);
	}
	
	void Doctor(String Patientname, String Filename, int Token)
	{
		System.out.println("Patientname: "+Patientname+"  Filename: "+Filename+"  Token No: "+Token);
	}
	
	void Doctor(String Hospitalname)
	{
		System.out.println("Hospital name: "+Hospitalname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Healthcare obj = new Healthcare();
		obj.Doctor("Dr.Ajay", "9158990640");
		obj.Doctor("Rs."+999);
		obj.Doctor("Arun","Cancer", 58);
		obj.Doctor("AK");
		
	}

}
