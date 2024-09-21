package PracticePrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		// To remove Junk character
		
		
		String s = "#####   Ushs!!@#@$#@ 12374848 djgjhgsj  &*%%$^";
		//Regular Expression to be used
		     s= s.replaceAll("[^A-Za-z0-9]" ,"");
		     System.out.println(s);
		
		
	}

}
