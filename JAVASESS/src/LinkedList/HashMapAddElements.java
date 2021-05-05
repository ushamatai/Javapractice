package LinkedList;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

import Interviewpractice.armstrongno;

import java.util.*;

public class HashMapAddElements {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer, String> hash= new HashMap<>();
		hash.put(2, "NEha");
		hash.put(3, "Kavita");
		hash.put(4, "Chirag");
		hash.put(5, "USha");
		
		
		///Through values
		for(String m :hash.values()) {
			System.out.println(m);
			
		}
		
		
		
		
		
		System.out.println("Using KeySet");
		//Normal iterator using while on Keys
		Iterator<Integer> itr=hash.keySet().iterator();
		while(itr.hasNext())
		{
		int key=	itr.next();
		   String value=      hash.get(key);
		   System.out.println("Key is :" + key + "value is : "  + value);
		}
		
		
		System.out.println("------------Map.entry-----------------");
		System.out.println(hash.entrySet());
		
		
		//For each using iterator
		
		for (Map.Entry m : hash.entrySet()) {
			System.out.println("Key is " + m.getKey() + "value is  :  " + m.getValue());
			
		}
		
		System.out.println("------Entry on generics and for each loop-----------------------");
		
		
		for (Entry <Integer, String >m : hash.entrySet()) {
			System.out.println("Key is " + m.getKey() + "value is  :  " + m.getValue());
			
		}
		
		
		//Through Lambda accessing the values
	
		
		
		hash.forEach((p,q)-> System.out.println("key is " +p+  "    value is   "+q));
		hash.forEach((p,q) -> System.out.println(p+ q));
		
		
		
		
		//Using Streams
		hash.entrySet().stream().forEach(e -> System.out.println(e.getKey() + e.getValue()));
		
		
		
		
		
		
		
		
		
	}

}
