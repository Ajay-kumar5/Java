package Odd_Even;

import java.util.Scanner;

public class Num {
	
	void Count()
	{
		for(int i = 0;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even num: "+i);
			}
		}
	}
	
	void ints()
	{
		for(int a = 0;a<100;a++)
		{
			if(a%2!=0)
			{
				System.out.println("Odd Num: "+a);
			}
		}
	}
	
	void Menu()
	{
		Scanner W = new Scanner(System.in);
		System.out.print("Enter Even or Odd: ");
		String x = W.next();
		
		if(x.equalsIgnoreCase("Even"))
		{
			this.Count();
		}
		else if(x.equalsIgnoreCase("Odd"))
		{
			this.ints();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Num obj = new Num();
		//obj.ints();
		//obj.Count();
		obj.Menu();
	}

}
