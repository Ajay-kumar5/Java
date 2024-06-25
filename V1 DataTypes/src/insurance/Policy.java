package insurance;

public class Policy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Policybazaar Insurance Brokers Private Limited"+'\n'+'\n');

		String Log = "Sign in";
		String Policies = "Policies";
		String Help = "Get help";
		String Claim = "Claim Support";
		String Renew = "Renew Policy";
		
		System.out.println(Log+'\t'+'\t'+Policies+'\t'+'\t'+Help+'\t'+'\t'+Claim+'\t'+'\t'+Renew+'\n'+'\n');

		
		String Products = "Term Insurance:";
		String Women = "Term Insurance for Womens 2cr Term Plan @ 888pm";
		String wife = "Term Insurance for House Wife 1cr Term Plan @566pm";
		String NRI = "Term Insurance for NRIs 50lakhs Term Plan @799pm";
		
		String items = "Health Insurance";   
		String Family = "Family Health Insurance";
		String Parent = "Health Insurance for Parents";
		String Critical = "Critical Illness Insurance";
		int Rate = 25000;
		int Time = 1;

		
		String Items = "Motor Insurance";
		String car = "Car Insurance";
		String Bike = "Bike Insurance";
		String Third = "Third Party Insurance";
		int Amount = 5000;
		int years = 1;
		
		
		
		
		
		System.out.println("Products = "+Products);
		System.out.println(Women);
		System.out.println(wife);
		System.out.println(NRI+'\n');
		
		System.out.println("Products = "+items);
		System.out.println(Family);
		System.out.println(Parent);
		System.out.println(Critical);
		System.out.println("Amount Start from = "+Rate);
		System.out.println("Renewal = "+Time+"Yrs"+'\n');
		
		System.out.println("Products = "+Items);
		System.out.println(car);
		System.out.println(Bike);
		System.out.println(Third);
		System.out.println("Amount Start from = "+Amount);
		System.out.println("Renewal = "+years+"Yrs"+'\n');
		
		String Tcal = "Term Insurance Calculator:";
		String N = "Name ---";
		String DOB = "DOB ---";
		String TMobile = "Mobile number ---";
		String Gender = "Gender --";
		
		String Hcal = "Health Insurance Calculator:";
		String Member = "Select Member = Son\\Wife\\Father\\Mother";
		String Age = "Enter Age --";
		String HMobile = "Mobile number ---";
		String City = "Enter City --";
		
		String Car = "Car Insurance Calculator:";
		String no = "Enter the car number";
		
		String Bikes = "Bike Insurance Calculator:";
		String Bno = "Enter the Bike number";

		
		System.out.println(Tcal+'\t'+'\t'+Hcal+'\t'+'\t'+'\t'+Car+'\t'+'\t'+Bikes);
		System.out.println(N+'\t'+'\t'+'\t'+'\t'+Member+'\t'+'\t'+no+'\t'+'\t'+'\t'+Bno);
		System.out.println(DOB+'\t'+'\t'+'\t'+'\t'+'\t'+Age);
		System.out.println(TMobile+'\t'+'\t'+'\t'+HMobile);
		System.out.println(Gender+'\t'+'\t'+'\t'+'\t'+City+'\n'+'\n');

		
		String Email = "insure@gmail.com";
		String Mobile = "9587645897";
		
	
		
		System.out.println("Support");
		System.out.println("Email ID = "+Email);
		System.out.println("Mobile No. = "+Mobile);
		
	}

}
