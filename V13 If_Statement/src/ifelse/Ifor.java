package ifelse;

import java.util.Scanner;

public class Ifor {

	Ifor()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the age");
		int x = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the Weight");
		int y = b.nextInt();
		
		if(x>18 || y>50)
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("Not Ccorrect");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ifor obj =new Ifor();
	}

}
