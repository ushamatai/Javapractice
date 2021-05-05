package LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		
		Set<String> hashset=new HashSet<String>();
		hashset.add("SwitzerLand");
		hashset.add("Mynamar");
		hashset.add("Denmark");
		hashset.add("India");
		hashset.add(null);
		
		//Remove if method
		hashset.removeIf(str->str.contains("India"));
		
		
		//Duplicates in hashset are not allowed
		System.out.println(hashset.add("India"));
		//To add a new created array which is then converted into list and then added to extract union
		
		hashset.addAll(Arrays.asList(new String[] {"4","24"}));
		System.out.println(hashset);
		
		//Printing values through Iterator
		
		System.out.println("-------------Through Iterator--------------");
		Iterator<String>  it =hashset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//Printing values through for each loop
		
		System.out.println("-------------for each loop--------------");
		for(String e: hashset) {
			System.out.println(e);
		}
		
		System.out.println("----To check if the value Contains in hashset--------------");
		
		System.out.println(hashset.contains("India"));
		
		System.out.println("----To remove india and then print--------------");
		
		hashset.remove("India");
		System.out.println(hashset);
		
		//Declaring new interger set
		
		//We have method called "as list" in arrays which converts array to list
		
		Set<Integer> intvalue=new HashSet<Integer>();
		intvalue.addAll(Arrays.asList(new Integer[] {1,27,5,6,7}));
		
		Set<Integer> intvalue1=new HashSet<Integer>();
		intvalue1.addAll(Arrays.asList(new Integer[] {9,27,5,6,9}));
		
		//To get the union
		
		Set<Integer> union=new HashSet<Integer>(intvalue);
		union.addAll(intvalue1);
		System.out.println("Below will print union of 2 sets---");
		System.out.println(union);
		
		//To get the intersection
		
		Set<Integer> intersect=new HashSet<Integer>(intvalue);
		intersect.retainAll(intvalue1);
		System.out.println("Below will print intersection of 2 sets---");
		System.out.println(intersect);
		
		
		
		//To get the difference
		
	     Set<Integer> diff=new HashSet<Integer>(intvalue);
	     diff.removeAll(intvalue1);
	     System.out.println("Below will print difference of 2 sets---");
	     System.out.println(diff);
	
		
		
		
		
		
		
		
		

	}

}
