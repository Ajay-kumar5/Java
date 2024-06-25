package switchcase;

import java.util.Scanner;

public class Days {

	
	void D()
	{
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Day:");
		int Day = a.nextInt();
		
		
		switch(Day)
		{
		case 1:
			System.out.println("Monday");
			break; 
		case 2:
			System.out.println("Thuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Wrong");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Days obj = new Days();
		obj.D();
	}

}
