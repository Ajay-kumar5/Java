package ifelse;

import java.util.Scanner;

public class If {

	void age()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the age");
		int b = a.nextInt();
		
		if(b>=18)
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

		If obj = new If();
		obj.age();
	}

}
