package PracticePrograms;
import java.util.*;

public class practiceset {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		//To insert in set
		
		set.add(43);
		set.add(5);
		set.add(8);
		
		
		//To search in set
		
		System.out.println(set.contains(5));
		System.out.println(set.contains(56));
		
		//to remove from set
		
		set.remove(8);
		
		
		// To iterate through set
		
		Iterator it =set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	

		
		
		
		
		

	}

}
