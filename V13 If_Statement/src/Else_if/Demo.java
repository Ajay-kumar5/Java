package Else_if;

import java.util.Scanner;

public class Demo {
	
	
	void D()
	{
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		System.out.println("Enter age 20-40:");
		int age  = a.nextInt();
		System.out.println("Enter Weigth 60-80:");
		int Weigth = b.nextInt();
		
		if(age<20 && Weigth<60)
		{
			System.out.println("Age lessthen 20 and Weigth lessthen 60");
			
		}
		else if(age<30 && Weigth<70)
		{
			System.out.println("Age lessthen 30 and Weigth lessthen 70");

		}
		else if (age<40 && Weigth<80)
		{
			System.out.println("Age lessthen 40 and Weigth lessthen 80");

		}
		
		else
		{
			System.out.println("InCorrect");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new Demo();
		obj.D();

	}

}
