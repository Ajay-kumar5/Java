 package Else_if;

import java.util.Scanner;

public class Rank {
	
	void R()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a Mark:");
		int mark = a.nextInt();
		
		if(mark>=50 && mark<60)
		{
			System.out.println("Grade E");
		}
		else if (mark>=60 && mark<70)
		{
			System.out.println("Grade D");

		}
		else if (mark>=70 && mark<80)
		{
			System.out.println("Grade C");

		}
		else if (mark>=80 && mark<90)
		{
			System.out.println("Grade B");

		}
		else if (mark>=90 && mark< 100)
		{
			System.out.println("Grade A");

		}
		else
		{
			System.out.println("Incorrect");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rank obj = new Rank();
		obj.R();
	}

}
