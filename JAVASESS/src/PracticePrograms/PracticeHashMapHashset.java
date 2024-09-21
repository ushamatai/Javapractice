package PracticePrograms;

import java.awt.Image;
import java.util.*;

public class PracticeHashMapHashset {

	public static void main(String[] args) {
		

		
		//Declare HashMap
		HashMap<String, Integer>  map = new HashMap();
		
		//Insert Values in Map
		map.put("India", 97);
		map.put("US", 89);
		map.put("Australia", 40);
		map.put("China", 39);
		
		//Search Operation[This can search for both value and Key]
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsValue(39));
		
		
		//Get to check for Search Operations
		//Get will print the value of the associated key or will print null if key is not present
		System.out.println(map.get("Indian"));
		System.out.println("--------------");
		
		System.out.println("------Multiple Way to iterate through HashMaps[Map.Entry]--------");
		
		//1. To iterate through HashMap
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			//System.out.println(e.setValue(78));
		}
		
		System.out.println("------Print Only Keys--------");
		
		//To only print Keys
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
			
		}
		
		//To remove the values
		map.remove("China");
		
		
		
		System.out.println("------Multiple Way to iterate through HashMaps[Iterator]--------");
		
		Iterator it = map.keySet().iterator();
	  
		while (it.hasNext()) {
			String key = (String) it.next();
			
                  System.out.println( key);
                  System.out.println( map.get(key));
			
		}
		
		
		System.out.println("------Multiple Way to iterate through HashMaps[Using KeySet and Value Method]--------");
		
	for ( String key : map.keySet()) {
		System.out.println("Key is : " + key + " and the value is : " + map.get(key));
		
	}
		
	for ( Integer value : map.values()) {
		System.out.println( " Value is : " + value);
		
	}
		

	}

}
