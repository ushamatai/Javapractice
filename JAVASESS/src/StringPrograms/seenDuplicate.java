package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class seenDuplicate {

	public static void main(String[] args) {
		String s="aabbccshsgdk";
		Set<Character> set = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			boolean dup=false;
			
			for(int j=0 ; j<s.length(); j++)
			
			{
				if(s.charAt(i)==s.charAt(j) &&(i!=j)) {
					dup=true;
					set.add(s.charAt(i));
					break;
				}
				
			}
			
			
			
			if(!dup)
			{
				System.out.println(s.charAt(i));
		}
			
			
			
		

	}
		System.out.println("--------------------");
		
		System.out.println(set);
	}
	
}


