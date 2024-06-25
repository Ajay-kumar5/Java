package loop;

public class Double_For {
	
	
	
	void Num()
	{
		
		
		for(int i=0;i<=10;i++)
		{
			
			
			for(int j=1;j<=10;j++)
			{ 
				System.out.println(i+"x"+j+"="+i*j);
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double_For obj = new Double_For();
		obj.Num();
	}

}
