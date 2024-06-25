package parameter;

public class Insurance {


	Insurance(String Username,int ID)
	{
		System.out.println("Policybazaar Insurance Brokers Private Limited"+'\n'+'\n');

		int W = 10;
		
		String Help = "Get help";
		String Claim = "Claim Support";
		String Renew = "Renew Policy";
		
		System.out.println("Username: "+Username+'\t'+'\t'+"ID:"+ID+'\t'+'\t'+Help+'\t'+'\t'+Claim+'\t'+'\t'+Renew+'\n'+'\n');
		System.out.println("Flat "+W+" % discount for all Poicy in our company"+'\n'+'\n');
	}
	
	void Types()
	{
		String T = "Health insurance";
		String T1 = "Motor insurance";
		String T2 = "Home insurance";
		String  T3 = "Term life insurance";
		String T4 = "Travel insurance";
		String T5 ="Child insurance plans";
		
		System.out.println("Types of Insurance: ");
		System.out.println(T);
		System.out.println(T1);
		System.out.println(T2);
		System.out.println(T3);
		System.out.println(T4);
		System.out.println(T5+'\n');

	}
	
	void Health()
	{
		String H = "Individual Health Insurance";
		String H1 = "Family Health Insurance";
		String H2 = "Critical Illness Insurance";
		String H3 = "Senior Citizen Health Insurance";
		String H4 = "Personal Accident Insurance";
		String H5 = "Mediclaim";
		String H6 = "Group Health Insurance";
		
		System.out.println("Health Insurance Types: ");
		System.out.println(H);
		System.out.println(H1);
		System.out.println(H2);
		System.out.println(H3);
		System.out.println(H4);
		System.out.println(H5);
		System.out.println(H6+'\n');
		
	}
	
	void Home()
	{
		String Home = "Liability insurance";
		String Home1 = "Buildings insurance";
		String  Home2 = "Theft insurance covers";
		String Home3 = "Home Fire insurance";
		
		System.out.println("Home Insurance Types: ");
		System.out.println(Home);
		System.out.println(Home1);
		System.out.println(Home2);
		System.out.println(Home3);
		
	}
	
	void Motor()
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
	
	void TermLife()
	{
		String L = "Level Term Plans";
		String L1 = "Term Returm of Premium Plans";
		String L2 = "No-Cost Term Insurance Plans";
		String L3 = "Increasing Terms Plans";
		String L4 = "Decreasing Term Plan";
		String L5 = "Convertiable Term Plans";
		
		System.out.println("Term Life Insurance Types: ");
		System.out.println(L);
		System.out.println(L1);
		System.out.println(L2);
		System.out.println(L3);
		System.out.println(L4);
		System.out.println(L5);
	}
	
	void Travel()
	{
		String Travel = "Domestic travel insurance";
		String Travel1 = "International travel insurance";
		String Travel2 = "Baggage delay";
		String Travel3 = "Loss of passport";
		String Travel4 = "Aircraft hijacking";
		
		System.out.println("Travel Insurance Types: ");
		System.out.println(Travel);
		System.out.println(Travel1);
		System.out.println(Travel2);
		System.out.println(Travel3);
		System.out.println(Travel4);
	}
	
	void Child()
	{
		String C = "Unit Linked Insurance Plans";
		String C1 = "Traditional Endowment Plans";
		String C2 = "Single-Premium Child Plan";
		String C3 = "Regular Premium Child Plan";
		
		System.out.println("Child Insurance Types: ");
		System.out.println(C);
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
	}
	
	void Apply()
	{
		String Health = "select a Types of Health Insurance";
		String Health1 = "Select a Premium category";
		String Health2 = "Select Gender";
		String Health3 = "Age";
		String Health4 = "occupation";
		String Health5 = "City";
		
		String Home = "select a Types of Home Insurance";
		String Home1 = "Select a Premium category";
		String Home2 = "City";
		
		String Motor = "select a Types of Motor Insurance";
		String Motor1 = "Select a Premium category";
		String Motor2 = "Enter the Vechile number";
		
		String Life = "select a Types of Health Insurance";
		String Life1 = "Select a Premium category";
		String Life2 = "Select Gender";
		String Life3 = "Age";
		String Life4 = "occupation";
		String Life5 = "City";
		
		String Travel = "select a Types of Travel Insurance";
		String Travel1 = "Select a Premium category";
		String Travel2 = "Enter Take on City";
		String Travel3 = "Enter Take off City";
		
		String Child = "select a Types of Health Insurance";
		String Child1 = "Select a Premium category";
		String Child2 = "Select Gender";
		String Child3 = "Age";
		String Child4 = "City";

		
		System.out.println("Apply for Health Insurance: ");
		System.out.println(Health);
		System.out.println(Health1);
		System.out.println(Health2);
		System.out.println(Health3);
		System.out.println(Health4);
		System.out.println(Health5);
		System.out.println("-----Sumbit------");
		
		System.out.println("Apply for Hime Insurance: ");
		System.out.println(Home);
		System.out.println(Home1);
		System.out.println(Home2);
		System.out.println("-----Sumbit------");

		System.out.println("Apply for Home Insurance: ");
		System.out.println(Motor);
		System.out.println(Motor1);
		System.out.println(Motor2);
		System.out.println("-----Sumbit------");

		System.out.println("Apply for Term Life Insurance: ");
		System.out.println(Life);
		System.out.println(Life1);
		System.out.println(Life2);
		System.out.println(Life3);
		System.out.println(Life4);
		System.out.println(Life5);
		System.out.println("-----Sumbit------");
		
		System.out.println("Apply for Travel Insurance: ");
		System.out.println(Travel);
		System.out.println(Travel1);
		System.out.println(Travel2);
		System.out.println(Travel3);
		System.out.println("-----Sumbit------");
		
		System.out.println("Apply for Child Insurance: ");
		System.out.println(Child);
		System.out.println(Child1);
		System.out.println(Child2);
		System.out.println(Child3);
		System.out.println(Child4);
		System.out.println("-----Sumbit------");
	}
	
	void Claims()
	{
		String Claims = "select of Types of Insurance to be claim:";
		String Claims1 = "Enter the reason for Claim";
		String Claims2 = "Date of Claim";
		String Claims3 = "Upload the necessary documents";
		
		System.out.println(Claims);
		System.out.println(Claims1);
		System.out.println(Claims2);
		System.out.println(Claims3);
		System.out.println("-----Verify---and---Sumbit------");
	}
	
	void Bestoffers()
	{

		String Women = "Term Insurance for Womens 2cr Term Plan @ 888pm";
		String wife = "Term Insurance for House Wife 1cr Term Plan @566pm";
		String NRI = "Term Insurance for NRIs 50lakhs Term Plan @799pm";
		String Car = "Car Insurance offer Price start@15%";
		String bike = "Bike Insurance offer Price start@20%";
		String Health = "Health Insurance offer Price start@15%";

		
		System.out.println("Best offer");
		System.out.println(Women);
		System.out.println(wife);
		System.out.println(Car);
		System.out.println(Health);
		System.out.println(bike);
		System.out.println(NRI+'\n');
	}
	
	void Payment()
	{
		String Pay ="All Debt & Credit card acceptable";
		String Debt = "Debt Number --";
		String Credit = "Credit Number --";
		
		String Cash = "Cash on delivery";
		
		String Online = "Online Payment";
		String UPI = "Google Pay ---- Phonepe ---- Paytm";
		
		System.out.println("Paymeny Method:");
		System.out.println(Pay);
		System.out.println(Debt);
		System.out.println(Credit+'\n');
		System.out.println(Online);
		System.out.println(UPI+'\n');
		System.out.println(Cash+'\n'+'\n');
	}
	
	void customerSrevices()
	{
		String c = "Contact Us";
		String FAQ  = "FAQ";
		String S = "Shipping";
		String cancel = "Cancellation";
		String R = "Return";
		String P = "Privacy policy";

		System.out.println("CUSTOMER POLICIES:"+'\t'+"Keep in touch");
		System.out.println(c+'\t'+'\t'+"Fb");
		System.out.println(FAQ+'\t'+'\t'+'\t'+"9865874123");
		System.out.println(S+'\t'+'\t'+"Myntra@shop.in");
		System.out.println(S);
		System.out.println(cancel);
		System.out.println(R);
		System.out.println(P);
	}  
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insurance obj = new Insurance("AK",5265);
		obj.Types();
		obj.Health();
		obj.Home();
		obj.Motor();
		obj.TermLife();
		obj.Travel();
		obj.Child();
		obj.Apply();
		obj.Claims();
		obj.Bestoffers();
		obj.Payment();
		obj.customerSrevices();
	}
	

}

