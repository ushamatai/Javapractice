package LinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;




public class HashMapPractice {

	public static void main(String[] args) {
		//hashmap are stored in the form of key value pair
		//there can be duplicate values
		//But key value should be unique
		//Does not mainetain any order
		//Unsynchronized
		//permits null
		
		HashMap<String, String> country=new HashMap<>();
		country.put("India", "Delhi");
		country.put("USA", "DC");
		country.put(null, "Kerala");
		country.put(null, "Delhi");
		country.put("France", null);
		country.put("Spain", null);
		
		//Delhi would be the o/p as key value cannot be duplicate
		//Hence, value will be overridden
		System.out.println(country.get(null));
		
		
		//Iterate only values
		
		
	//Iterating over the keys: key set
		Iterator<String> it=country.keySet().iterator();
		
		while(it.hasNext()) {
			String key=it.next();
			String value= country.get(key);
			System.out.println("KEy value is : "  + key + "Value is : " + value);
		}
		System.out.println("----------------Entry class and iterator---------------------------------");
		
		//Iterating over the set
		//Iterator<country.Entry<String, String>> it1=country.entrySet().iterator();
		Iterator<Entry<String, String>> itr = country.entrySet().iterator();
		while(itr.hasNext()) {
			
			Entry<String, String> itr1=itr.next();
			
			System.out.println("Key is " + itr1.getKey() + "     Value is " + itr1.getValue());
		}
		
		System.out.println("--------------lambda-----------------------------------");
		country.forEach((p,q)-> System.out.println("key is " +p+  "    value is   "+q));
		
		
		System.out.println("----------------Entry class and for each  loop---------------------------------");
		
		for(Map.Entry m : country.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue());  
		}
		
		
		
		
		

	}

}
