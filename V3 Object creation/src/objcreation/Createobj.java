package objcreation;

public class Createobj {

	void Motors()
	{
		String M = "Car insurance";
		String M1 = "Bike insurance";
		String M2 = "Commercial vehicle insurance";
		String M3 = "Own damage insurance";
		String M4 = "Liability coverage";
		String M5 = "Roadside assistance";
		
		System.out.println("Motor Insurance Types: ");
		System.out.println(M);
		System.out.println(M1);
		System.out.println(M2);
		System.out.println(M3);
		System.out.println(M4);
		System.out.println(M5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Createobj obj = new Createobj();
		obj.Motors();
	}

}