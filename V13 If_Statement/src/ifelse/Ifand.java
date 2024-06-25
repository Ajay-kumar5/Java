package ifelse;

import java.util.Scanner;

public class Ifand {

	void Weight()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the age");
		int x = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the Weight");
		int y = b.nextInt();
		
		if(x>18 && y>50)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Not Correct");
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ifand obj = new Ifand();
		obj.Weight();
	}

}
