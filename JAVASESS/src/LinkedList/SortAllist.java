package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortAllist {

	public static void main(String[] args) {
String	strr[]= { "doc", "cod", "doc", "farmer", "gsgsfd"};
	List<String> list =Arrays.asList(strr);
//	//list.add("dsdd");
//	
//	Collections.sort(list);
//    for(String str: list) System.out.print(" "+str);
		
		List<String> sList=fun(list);
		for(String str: sList) System.out.print(" "+str);
		
		
}
	
	
	public static List<String> fun(List<String> text) {
		
		List<String> sortedList=new ArrayList<String>();
		 List<String> listWithoutDuplicates = null;
		Collections.sort(text);
		
		for(int i=0;i<text.size(); i++) {
			
			String x= text.get(i);
		char tempArray[]=	x.toCharArray();
		 Arrays.sort(tempArray);
		 //System.out.println(tempArray);
		 sortedList.add(new String(tempArray));
		  listWithoutDuplicates = sortedList.stream()
			     .distinct()
			     .collect(Collectors.toList());
		 
		
		
		}
		
		
		
		
		return listWithoutDuplicates;
		
	}

	

}

