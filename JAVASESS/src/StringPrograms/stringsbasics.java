package StringPrograms;

public class stringsbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  string ="usha usha usha usha usha usha";
		String  string1 ="Hello how is hash and mash";
		
		
		
		//String Occurence
		int first_occ = string1.indexOf('h');
		
		System.out.println(first_occ);
		
		int sec_occ = string1.indexOf('h', first_occ+1);
		System.out.println(sec_occ);
		
		int third_occ =string1.indexOf('h',sec_occ+1 );
		System.out.println(third_occ);
		
		System.out.println(string.length());
		char c=string.charAt(2);
		System.out.println(c);
		int x=string.indexOf('h');
		System.out.println(x);
		
		//This will start searching character s from the 3rd index
		System.out.println(string.indexOf('s', 3));
		//this will search the index of s and then add 1 to it and then find the occurence of character u from it
		System.out.println(string.indexOf('u', string.indexOf('s')+1));
		//2nd occurence of u
		System.out.println("------------");
		int secondOccurence=string.indexOf('u', string.indexOf('u')+1);
		int thirdoccurence=string.indexOf('u', secondOccurence+1);
		System.out.println(thirdoccurence);
		int fourthoccurence=string.indexOf('u', thirdoccurence+1);
		System.out.println(fourthoccurence);
		System.out.println("------------");
		String s = "    hello   world   ";
		//trim will remove white spaces from both sides
		System.out.println(s.trim());
		//this will trim the spaces and also replace the spaces is between and will remove the spaces
		System.out.println(s.trim().replace(" ", ""));
		System.out.println(s.replace(" ", ""));
		String dob= "13/10/1987";
		System.out.println(dob.replace("/", "-"));
		

	}
}
