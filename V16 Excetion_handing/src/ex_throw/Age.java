package ex_throw;

import java.util.Scanner;

public class Age {
	
	void A()
	{
		Scanner b = new Scanner(System.in);
		System.out.println("Enter a age");
		int c = b.nextInt();
		
		if(c>18)
		{
			System.out.println("eligible");
		}
		else
		{
		
			throw new ArithmeticException("Ages is mismatch");
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Age obj = new Age();
		obj.A();
	}

}
