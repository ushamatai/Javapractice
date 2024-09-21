package PracticePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateStringinArray {

	public static void main(String[] args) {
		
		String stat= "Java is big Java and small Java big  as well";
		findduplicate(stat);
		
		
		

	}
	
	
	
	
	public static  void  findduplicate(String name) {
				
		String arr[]=name.split(" ");	
		
		HashMap<String, Integer> map= new HashMap<>();
		
		for(String e: arr) {			
			if(map.containsKey(e)) {		
				map.put(e, map.get(e)+1);
			}
			else {
				map.put(e, 1);
			}			
		}
		
		//to iterate through hashmap through Entry Set
		
		for(Map.Entry<String, Integer> iterate :  map.entrySet()) {
			
			if (iterate.getValue()>1) {
			System.out.println("Duplicate Element is :: " + iterate.getKey() + "  and is repeated for " + iterate.getValue());			
				
			}				
		}
		
		
		//to iterate through hashmap throughKeyset
		Set<String> set = map.keySet();
		for(String e: set) {
			if(map.get(e)>1) {
				System.out.println("Duplicate Element is :: " + e + "  and is repeated for " +  map.get(e));			
			
				
			}
		}
	
		
	}
	
	

}
