package healthcareV3;

public class Pharmeasy {

	
		void Welcome()
		{
			System.out.println("Pharmeasy"+'\n'+'\n');
			
			
			String Log = "Hello,Login";
			String offer = "Offers";
			String Cart = "Cart";
			
			System.out.println(Log+'\t'+'\t'+offer+'\t'+'\t'+Cart+'\n'+'\n'); 
		}
		
		void MedicinesTypes()
		{
			String Types = "Types of Medicines" ;
			String Antibiotics = "Antibiotics: -- Fight bacterial infections.";
			String Antivirals = "Antivirals: -- Treat viral infections by inhibiting the development of the virus.";
			String Antifungals = "Antifungals: --Combat fungal infections.";
			String Analgesics = "Analgesics: --Pain Relievers";
			String Antipyretics ="Antipyretics: --Reduce fever.";
			String Antiseptics = "Antiseptics: --used for cuts, wounds";
			String Vaccines = "Vaccines: --Prevent disease by stimulating the body's immune response.";
			
			String Mrate = "Price Starts@ ";
			int Prate = 5 - 199;
			String Orate = "offer Starts@10%";
			
			System.out.println(Types);
			System.out.println(Antibiotics);
			System.out.println(Antivirals);
			System.out.println(Antifungals);
			System.out.println(Analgesics);
			System.out.println(Antipyretics);
			System.out.println(Antiseptics);
			System.out.println(Vaccines+'\n');
			System.out.println(Mrate+Prate);
			System.out.println(Orate);
				
			}
		
			void Medicinesorder()
			{
				String Med = "Medicines order";
				String Off = "Flat 15% off";
				String pin = "Enter Pincode:";
				String search = "Search for Medicines:";
				
				System.out.println(Off+'\n');
				System.out.println(Med+'\n');
				System.out.println(pin+'\t'+'\t'+search+'\n'+'\n');
			}
			
			void Healthcare()
			{
				String Health = "Healthcare and offers:";
				String Elder = "Elderly care";
				String Personal = "Personal care";
				String HDevices = "Healthcare Devices";
				String SS = "Summer Store";
				String SC = "Skin care";
				String Mother = "Mother and Baby care";
				String AW = "Accessories & Wearables";
				String Fit = "Fitness supplements";
				String  AC = "Ayurvedic care";
				String Diabtic = "Diabetic care";
				String HC = "Health Condition";
				String Home ="Home care";
				
				
				System.out.println(Health+'\n');
				System.out.println(Elder+'\t'+'\t'+"upto 45% off");
				System.out.println(Personal+'\t'+'\t'+"upto 80% off");
				System.out.println(HDevices+'\t'+"upto 35% off");
				System.out.println(SS);
				System.out.println(SC+'\t'+'\t'+"upto 45% off");
				System.out.println(Mother+'\t'+"upto 50% off");
				System.out.println(AW+'\t'+"upto 15% off");
				System.out.println(Fit+'\t'+"upto 20% off");
				System.out.println(AC+'\t'+'\t'+"upto 30% off");
				System.out.println(Diabtic+'\t'+'\t'+"upto 55% off");
				System.out.println(HC+'\t'+"upto 40% off");
				System.out.println(Home+'\t'+'\t'+"upto 50% off"+'\n'+'\n');
				
			}
			
			void LabTest()
			{
				String Lab = "Lab Test:";
				
				String Suger = "Fastinh Blood Suger Test";
				int Srate = 120;
				String Blood = "Blood Group";
				int Brate = 200;
				String Urine = "Urine Test";
				int Urate = 500;
				String Test = "Other Blood Test";
				int Trate = 399;
				String Imaging  = "Imaging Test";
				int Irate = 250;
				String Molecular = "Molecular Test";
				int Mrate = 999;
				
				String results = "Result is send to Mobile Number within 24 hours"+'\n'+'\n';
				
				System.out.println(Lab+'\n');
				System.out.println(Suger+" Start@"+'\t'+Srate);
				System.out.println(Blood+" Start@"+'\t'+'\t'+'\t'+Brate);
				System.out.println(Urine+" Start@"+'\t'+'\t'+'\t'+Urate);
				System.out.println(Imaging+" Start@"+'\t'+'\t'+'\t'+Irate);
				System.out.println(Molecular+" Start@"+'\t'+'\t'+'\t'+Mrate);
				System.out.println(Test+" Start@"+'\t'+'\t'+Trate+'\n');
				System.out.println(results);
			}
			
			void Speciality()
			{
				String Special = "Speciality Doctor:";
				
				String Primary = "Primary Care ---- Timing 9AM - 1PM and 3PM - 6PM";
				String P = "Family Medicine";
				String P1 = "Internal Medicine";
				String P2 = "Pediatrics";
				
				String Medical = "Medical Specialties ---- Timing 10AM - 2PM and 4PM - 9PM";
				String M = "Cardiology";
				String M1 = "Endocrinology";
				String M2 = "Nephrology";
				String M3 = "Neurology";
				String M4 = "Gastroenterology";
				
				System.out.println(Special);
				System.out.println(Primary);
				System.out.println(P);
				System.out.println(P1);
				System.out.println(P2+'\n');
				
				System.out.println(Medical);
				System.out.println(M);
				System.out.println(M1);
				System.out.println(M2);
				System.out.println(M3);
				System.out.println(M4+'\n');
				
				System.out.println("Fees Starts@ 199 - 499");
			} 
			
			void Appointment()
			{
				String Doctor = "Doctor Appointment:";
				String Speciality = "Enter Speciality:";
				String City = "Enter City:";
				String Pin = "Enter Pincode:";
				String Date = "Enter Date:";
				String Time  = "Enter time:";
				
				System.out.println(Doctor+'\n');
				System.out.println(Speciality);
				System.out.println(City);
				System.out.println(Pin);
				System.out.println(Date);
				System.out.println(Time+'\n'+'\n');
			}
			
			void Documents()
			{
				String N = "Client Name";
				String G = "Age";
				String C = "City";
				String M = "Mobile Number";
				String U = "Document Upload";
				
				System.out.println("Report upload"+'\n');
				System.out.println(N);
				System.out.println(G);
				System.out.println(C);
				System.out.println(M);
				System.out.println(U+'\n'+'\n');
				
			}
			
			void Claims()
			{
				String Institutional = "Institutional Claims";
				String Professional = "Professional Claims";
				String Pharmacy = "Pharmacy Claims";
				
				System.out.println("Types of Claims"+'\n');
				System.out.println(Institutional);
				System.out.println(Professional);
				System.out.println(Pharmacy);
			}
			
			void Claimpayment()
			{
				String N = "Client Name";
				String G = "Age";
				String C = "Health care name";
				String M = "Mobile Number";
				String U = "Upload Bill";

				
				System.out.println("Claim Payment"+'\n');
				System.out.println(N);
				System.out.println(G);
				System.out.println(C);
				System.out.println(M);
				System.out.println(U+'\n'+'\n');
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
			
			Pharmeasy obj = new Pharmeasy();
			obj.Welcome();
			obj.MedicinesTypes();
			obj.Medicinesorder();
			obj.Healthcare();
			obj.LabTest();
			obj.Speciality();
			obj.Appointment();
			obj.Documents();
			obj.Claims();
			obj.Claimpayment();
			obj.Payment();
			obj.customerSrevices();
			

		}

	}