package StringPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class mostCommonWord {

	public static void main(String[] args) {
		String para="This  This This is world world Ball Idiot IDIOT iDIOT idIOT WORLD ; dkf; , sdkjsh,;";
		String ban[]= {"This"};
		System.out.println(missing(para, ban));
		
		
		
		

	}
	
	public static String missing(String para, String[] ban) {
		HashSet<String> bannedWord= new HashSet<>();
		
		for(String s: ban) {
			bannedWord.add(s.toLowerCase());
			}
		//Now to compare words
		HashMap<String, Integer> count=  new HashMap<>();
		
		for(String e:para.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
			if(!bannedWord.contains(e)) {
				count.put(e, count.getOrDefault(e, 0)+1);
		}
		}
		String result="";
		for(String key:count.keySet()) {
			
			if(result.equals("") || count.get(key)> count.get(result)) {
				
				result=key;
				
			}
		}
		
		return result;
		
		
	}
	
	

}
