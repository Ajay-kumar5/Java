package haskmap;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Map {

	void M()
	{
		HashMap<String, Integer> Country = new HashMap<String, Integer>();
		Country.put("England",5);
		Country.put("India",1);
		Country.put("USA",2);
		
	
		//System.out.println(Country.get("India"));
		
		
//		for(java.util.Map.Entry<String , Integer> single:Country.entrySet())
//		{
//			System.out.print(single.getKey());
//			System.out.println(single.getValue());
//
//		}
		
//		for (String x : Country.keySet())
//		{
//			System.out.println(x);
//		}
		
		
		for(String y : Country.keySet())
		{
			System.out.println("Key "+ y + " Value: "+Country.get(y));
		}
		
		
		
		
		 	}
	
	void T()
	{
		TreeMap<Integer, String> S = new TreeMap<Integer, String>();
		S.put(01,"AJAY");
		S.put(105,"Harish");
		S.put(102, "Nithish");
		S.put(104,"Bala");
		
		
		for(Integer A : S.keySet())
		{
			System.out.println(A + " "+S.get(A));
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map obj = new Map();
		obj.T();
	}

}
