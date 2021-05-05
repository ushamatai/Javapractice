package StringPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatesInString {

	public static void main(String[] args) {
		
		//int arr[]=new int[]{92, 78, 65, 92, 78, 54, 78, 32, 40, 32, 32};
		String word="Great Responsibility";
		
		char[] arr1=word.toLowerCase().toCharArray();
		
		int num=0, max_count=0;
		HashMap<Character,Integer> hm = new HashMap<>();

		for(int i=0;i<arr1.length;i++)
		{
			if(hm.containsKey(arr1[i]))
			{
				hm.put(arr1[i], hm.get(arr1[i]) +1);
				for(Entry<Character,Integer> m :hm.entrySet())
				{
					
					System.out.println(m.getKey() + "value is  "+m.getValue());
				}
				

			}

			else
			{
				hm.put(arr1[i], 1);
			}
		}
		//System.out.println(hm);

		for(Entry<Character,Integer> m :hm.entrySet())
			
			
		{
			
		if (m.getValue()>=2) {
				
			System.out.println("Duplicate are  " + m.getKey() + " is : " + m.getValue());
		}
//		}

		

		


		
		
		
		
		
		
		
		
		
		
		
	}

	}}
