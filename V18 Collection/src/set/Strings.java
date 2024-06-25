package set;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Strings {

	
	void s()
	{
		
		Set<String> name = new HashSet<String>();
		name.add("Ajay");
		name.add("Harish");
		name.add("Ajay");
		name.add("25");
		
		//System.out.println(name.size());
		
		Iterator<String> alname = name.iterator();
		
		while(alname.hasNext()) {
			
			System.out.println(alname.next());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Strings obj = new Strings();
			obj.s();
	}

}
