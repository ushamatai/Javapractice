package PracticePrograms;

public class Stringreverse {

	public static void main(String[] args) {
		
		
		String s = "Hello World";
		
		
		//Using for loop
		
		int len = s.length();
	     String  rev = "";
		
		for(int i=len-1; i>=0;i--) { 
		rev=rev+ s.charAt(i);
						
		}
		System.out.println(rev);
		
		//Using Stringbuffer
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		

}
	
}
