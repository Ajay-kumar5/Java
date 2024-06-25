package Default;

public class Ecommerce {
	
	int x = 10;
	int y = 25;
	int z = 30;
	
	Ecommerce()
	{
		String Log = "Login\\Logout";
		String Profile = "Profile";
		String Wishlist = "Wishlist";
		String order ="Order";
		
		System.out.println("Myntra Online Shopping"+'\n'+'\n');
		
		System.out.println(Log+'\t'+'\t'+Profile+'\t'+'\t'+Wishlist+'\t'+'\t'+order+'\n');
	}
	
	void Menswear()
	{
		int Toprate = 199;
		String Topwear = "T-shirts";
		String Topwear1 = "Casual Shirts";
		String Topwear2 = "Foraml Shirts";
		String Topwear3 = "Sweaters";
		String Topwear4 = "Jackets";
		String Topwear5 = "Suits";
		
		int Bottomrate = 299;
		String Bottomwear = "Jeans";
		String Bottomwear1 = "Casual Trousers";
		String Bottomwear2 = "Shorts";
		String Bottomwear3 = "Pants";
		String Bottomwear4 = "Joggers";
		
		int Footrate = 399;
		String Footwear = "Casual Shoes";
		String Footwear1 = "Sports Shoes";
		String Footwear2 = "Formal Shoes";
		String Footwear3 = "Sneakers";
		String Footwear4 = "Flip Flops";
		
		int Festiverate = 699; 
		String Fwear = "Kurtas & Kurta sets";
		String Fwear1 = "Sherwanis";
		String Fwear2 = "Nehru Jackets";
		String Fwear3 = "Dhotis";
		
		System.out.println("Mens: Discount "+x+"%"+'\n');
		System.out.println("Topwears: Start@"+Toprate);
		System.out.println(Topwear);
		System.out.println(Topwear1);
		System.out.println(Topwear2);
		System.out.println(Topwear3);
		System.out.println(Topwear4);
		System.out.println(Topwear5+'\n');
		System.out.println("Bottomwears: Start@"+Bottomrate);
		System.out.println(Bottomwear);
		System.out.println(Bottomwear1);
		System.out.println(Bottomwear2);
		System.out.println(Bottomwear3);
		System.out.println(Bottomwear4+'\n');
		System.out.println("Festivewear: Start@"+Festiverate);
		System.out.println(Fwear);
		System.out.println(Fwear1);
		System.out.println(Fwear2);
		System.out.println(Fwear3+'\n');
		System.out.println("Footwears: Start@"+Footrate);
		System.out.println(Footwear);
		System.out.println(Footwear1);
		System.out.println(Footwear2);
		System.out.println(Footwear3);
		System.out.println(Footwear4+'\n');
	}
	
	void Womenswear()
	{
		int Westernrate = 249;
		String Western = "T-shirts";
		String Western1 = "Dresses";
		String Western2 = "Tops";
		String Western3 = "Jeans";
		String Western4 = "Playsuits";
		String Western5 = "Short & Skirts";
		
		int Fusionrate = 599;
		String Fusion = "sarees";
		String Fusion1 = "Ethnic wears";
		String Fusion2 = "Lessing,Salwars & Churidars";
		String Fusion3 = "Skirts";
		String Fusion4 = "Jackets";
		
		int WFootrate = 150;
		String WFootwear = "Casual Shoes";
		String WFootwear1 = "Flats";
		String WFootwear2 = "Heels";
		String WFootwear3 = "Boots";
		String WFootwear4 = "Floaters";
		
		System.out.println("Womens: Discount "+y+"%"+'\n');
		System.out.println("Westernrate wears: Start@"+Westernrate);
		System.out.println(Western);
		System.out.println(Western1);
		System.out.println(Western2);
		System.out.println(Western3);
		System.out.println(Western4);
		System.out.println(Western5+'\n');
		System.out.println("Fusionrate wears: Start@"+Fusionrate);
		System.out.println(Fusion);
		System.out.println(Fusion1);
		System.out.println(Fusion2);
		System.out.println(Fusion3);
		System.out.println(Fusion4+'\n');
		System.out.println("Footwears: Start@"+WFootrate);
		System.out.println(WFootwear);
		System.out.println(WFootwear1);
		System.out.println(WFootwear2);
		System.out.println(WFootwear3);
		System.out.println(WFootwear4+'\n');
	}
	
	void Kids()
	{
		int Brate = 99;
		String Bwear = "T-shirts";
		String Bwear1 = "Shirts";
		String Bwear2 = "Clothing sets";
		String Bwear3 = "Sweaters";
		String Bwear4 = "Party wears";
		String Bwear5 = "Value Packs";
				
		int Grate = 149;
		String Gwear = "T-shirts";
		String Gwear1 = "Dresses";
		String Gwear2 = "Tops";
		String Gwear3 = "Jeans";
		String Gwear4 = "Party wears";
		String Gwear5 = "Value Packs";
		
		System.out.println("Kids: Discount "+z+"%"+'\n');
		System.out.println("Boys Clothing: Start@"+Brate);
		System.out.println(Bwear);
		System.out.println(Bwear1);
		System.out.println(Bwear2);
		System.out.println(Bwear3);
		System.out.println(Bwear4);
		System.out.println(Bwear5+'\n');
		System.out.println("Girls Clothing: Start@"+Grate);
		System.out.println(Gwear);
		System.out.println(Gwear1);
		System.out.println(Gwear2);
		System.out.println(Gwear3);
		System.out.println(Gwear4);
		System.out.println(Gwear5+'\n');
	}
	
	void Fusion()
	{
		int Frate = 499;
		String F = "Sunglasses & Frames";
		String F1 = "Smart wearables";
		String F2 = "Fitness Gadgets";
		String F3 = "Headphones";
		String O = "offers starts@";
		
		System.out.println("Fusions: Start@"+Frate);
		System.out.println(F);
		System.out.println(F1);
		System.out.println(F2);
		System.out.println(F3+'\n');
		System.out.println(O+x+"-"+y+"%");
	}
	
	void Beauty()
	{
		int Beautyrate = 249;
		String B = "Makeup";
		String B1 = "Skincare";
		String B2 = "Haircare";
		String B3 = "Fragrances";
		String B4 = "Mens Grooming";
		String B5 = "Applications";
		String offer = "offers starts@";
		
		System.out.println("Beauty: Start@"+Beautyrate);
		System.out.println(B);
		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B3);
		System.out.println(B4);
		System.out.println(B5+'\n');
		System.out.println(offer+x+"-"+z+"%");

	}
	
	void Toys()
	{
		int Toyrate = 300;
		String T = "Learning & Development";
		String T1 = "Activity";
		String T2 = "Soft Toys";
		String T3 = "Play set";
		String Toffer = "Offer Starts@20% - 40%";
		
		
		System.out.println("Toys: Start@"+Toyrate);
		System.out.println(T);
		System.out.println(T1);
		System.out.println(T2);
		System.out.println(T3+'\n');
		System.out.println(Toffer+y+"-"+z+"%");
	}
	
	void Profile()
	{
		String Name = "Ajay kumar";
		int age = 25;
		String Add = "Palani";
		String mark = "Narakalpatti";
		int Pin = 624618;
		
		System.out.println(Name);
		System.out.println(age);
		System.out.println(Add);
		System.out.println(mark);
		System.out.println(Pin);
		
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
	
	void Order()
	{
		String Product = "Product types --";
		String Delivery = "Delivery Date --";
		String Address = "Deliver Address --";
		String Totalrate = "Total Price --";
		String Invoice = "Download Invoice";
		
		System.out.println(Product);
		System.out.println(Address);
		System.out.println(Totalrate);
		System.out.println(Delivery);
		System.out.println(Invoice);
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
		
		Ecommerce obj = new Ecommerce();
		obj.Menswear();
		obj.Womenswear();
		obj.Kids();
		obj.Fusion();
		obj.Beauty();
		obj.Toys();
		obj.Profile();
		obj.Payment();
		obj.Order();
		obj.customerSrevices();
		
	}

}


