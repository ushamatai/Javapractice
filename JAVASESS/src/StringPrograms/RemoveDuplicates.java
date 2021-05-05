package StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="This send one is for good for one This send send";
		String arr[]=str.toLowerCase().split(" ");
		//Arrays.asList(str.toLowerCase().split(" "));
		List<String> list=Arrays.asList(arr);
//		for(String e: arr) {
//			System.out.println(e);
//		}
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		Set<String> hmm=new HashSet<String>(list);
		System.out.println(hmm);
		System.out.println("--------------------");
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				//hm.put(arr[i], hm.get(arr[i]) +1);
				hm.put(arr[i], hm.get(arr[i])+1);
			}

			else
			{
				hm.put(arr[i], 1);
			}
		}
		//System.out.println(hm);

		for(Entry<String,Integer> m :hm.entrySet())
			
			
		{
			
		if (m.getValue()>=2) {
				
			System.out.println("Duplicate are  " + m.getKey() + " is : " + m.getValue());
//         	hm.put("-1", m.getValue());
//    		System.out.println("Updated Values are  " + m.getKey() + " is : " + m.getValue());
		}

	}

}
}
