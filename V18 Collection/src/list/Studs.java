package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Studs {

	void S()
	{
		List<String> a  = new ArrayList<String>();
		a.add("Kumar");
		a.add("Hari");
		a.add("Bala");
		a.add(null);
		a.add(null); 
		a.add("Hari");
		a.add(5,"AK");
		
		System.out.println(a);
	
		ListIterator<String> an =a.listIterator(); 
				
		while(an.hasNext())
		{
			System.out.println(an.next());
		}
		
		while(an.hasPrevious())
		{
			System.out.println(an.previous());
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studs ob  = new Studs();
		ob.S();
		
	}

}
