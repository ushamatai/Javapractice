package StringPrograms;

public class stringsbasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  string1 ="Chrome";
		String  string2 ="  chrome   ";
		//Equals is case sensitive
		System.out.println(string1.equals(string2));
		//this will ignore the case and here trim will trim the spaces from corners only
		System.out.println(string1.equalsIgnoreCase(string2.trim()));
		//Concat
		System.out.println(string1+string2);
		System.out.println(string1.concat(string2));
		System.out.println(string1 +"   Original String");
		//so here we have spli with xm but the first position is vacant hence lang[0] is blank
		//
		String lang = "xmJava;Pythonxm;Ruby;JavaScript";
		String languages[] = lang.split("xm");
		System.out.println("-----" +languages[0]);
		int length=languages.length;
		System.out.println(length);
		for(String ele : languages)
		{
			System.out.println("print"+ele);
		}
	
		
		

	}
}
