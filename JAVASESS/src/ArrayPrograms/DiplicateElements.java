package ArrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DiplicateElements {

	public static void main(String[] args) {
		
		String str= "This is java and this again java";
		String s[]=str.toLowerCase().split(" ");
		
		
		
		//Using for loop
		
		for(int i=0;i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++) {
				
				if(s[i].equals(s[j]))
				{
					System.out.println("Duplicate Element is " + s[i]);
				}
			}
				
		
			
		}
		
		//using hashset
		
		
		List <String> list=Arrays.asList(s);
		//To remove duplicates
		Set<String> set=new HashSet(list);
		System.out.println(set);
		
		System.out.println("----------------------");
		
		//To count duplicates
		Set<String> setlist=new HashSet();
		for(String e:s) {
			if(setlist.add(e)==false)
			{
				System.out.println("Duplicate Element is " + e);
			}
		}
		
		//using hashmap
		System.out.println("--------using hashmap--------------");
		
		Map< String, Integer> hm= new HashMap<>();
		
		for(int i=0;i<s.length;i++)
		{
			
			if(hm.containsKey(s[i]))
			{
				
				hm.put(s[i], hm.get(s[i]) +1);
				
			}
			
			else {
				
				hm.put(s[i], 1);
			}
		}
		
		for(Entry<String,Integer> m :hm.entrySet())
		{
			if(m.getValue() >1) {
				
			
			
			System.out.println(m.getKey() + "   value is   "+m.getValue());
			
		}
		}
		
		
		
		
		
		
		

	}

}
