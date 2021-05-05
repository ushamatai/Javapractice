package ArrayPrograms;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfElementArrayUsingHashMap {

	public static void main(String[] args) {
		int arr[]=new int[]{92, 78, 65, 92, 78, 54, 78, 32, 40, 32, 32};
		String word="Great Responsibility";
		int num=0, max_count=0;
		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{

				hm.put(arr[i], hm.get(arr[i]) +1);
			}

			else
			{
				hm.put(arr[i], 1);
			}
		}
		//System.out.println(hm);

		for(Entry<Integer,Integer> m :hm.entrySet())
			
			
		{
			
			if (m.getValue()>=2) {
				
			System.out.println("Frequency of  " + m.getKey() + " is : " + m.getValue());
		}}

		for(Entry<Integer, Integer> freq : hm.entrySet())
		{

			if(max_count<freq.getValue()) {

				max_count= freq.getValue();
				num=freq.getKey();
			}else if  (max_count==freq.getValue())
			{
				
				System.out.println("jkjk");
			}
			
		}
		System.out.println("Most frequent num is : " + num + " repeated for  " + max_count  + " times ." );

		






	}

}
