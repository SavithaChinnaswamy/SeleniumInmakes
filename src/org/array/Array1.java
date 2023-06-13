package org.array;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array1 
{
	public static void main(String[] args)
	{
		Map<Integer, String> mp = new LinkedHashMap<>();
		
		mp.put(10, "savi");
		mp.put(20, "kani");
		mp.put(30, "maya");
		
		
		System.out.println(mp);
		
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		Collection<String> v = mp.values();
		System.out.println(v);
		
		Set<Entry<Integer, String>> ent = mp.entrySet();
		System.out.println(ent);
		
		for (Entry<Integer, String> e : ent)
		{
			Integer key = e.getKey();
			System.out.println(key);
			
			String ve= e.getValue();
			System.out.println(ve);
			
		}

		
	
		
		
		
		
		
		
	
		
		
		
		
		
	
	}
	
	
}





