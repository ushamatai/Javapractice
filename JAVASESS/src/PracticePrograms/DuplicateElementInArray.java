package PracticePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		//Duplicate Element in array
		
		String prog_lang[] = {"Java", "Python", "P", "Ruby", "Java","Javascript", "P", "ruby"};
		
		//finding Duplicating by looping through each element in Array
		System.out.println("Finding Duplicating by looping through each element in Array" );
		
		for(int i=0;i< prog_lang.length;i++) {
			
			    for(int j=i+1; j< prog_lang.length; j++) {
			    	
			    	if(prog_lang[i].equals((prog_lang[j]))) {
			    		
			    		System.out.println("Duplicate Element is:: " +prog_lang[i] );
			    	}
			    	
			    }
		}
		
		
		//Finding Duplicating by using HashSet
				System.out.println("-------Finding Duplicating by HashSet---------" );
				
				HashSet<String> set = new HashSet<>();
				//To iterate through hashset
		//Using for loop
				for(String lang :prog_lang ) {
				//String print=	lang.toLowerCase();
				//System.out.println(print);
					if(!set.add(lang)) {
						System.out.println("Duplicate Element is:: " + lang);
						
					}
					else {
						set.add(lang);			
					}
				}
				
				System.out.println("-------Finding Duplicating by HashMap---------" );
				
				HashMap<String, Integer> map = new HashMap<>();
				
				for(String lang :prog_lang ) {			
					if(map.containsKey(lang)) {			
						map.put(lang, map.get(lang)+1);		
					}
					
					else {
						map.put(lang,1);
					}
				}
				
				//To iterate through HashMap
				
				for(Map.Entry<String, Integer> e : map.entrySet()) {
					if(e.getValue()>1) {
						
						System.out.println("Duplicate element is ::" + e.getKey() );
					}
					
					
				}
				
				
				
		
		
		

	}

}
