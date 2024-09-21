package StringPrograms;

public class substringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  string ="your total amount is 3000";
		System.out.println(string.length());
		System.out.println(string.substring(4));
		System.out.println(string.substring(5,9));
		System.out.println(string.substring(string.indexOf("is")+3,string.length()));
		System.out.println(string.indexOf("is"));
		//Mutable and Non Mutable Durga
		//so String s will not changed as String is immutable[we can not change]
	 String s = new String("durga");
	 StringBuffer s1 = new StringBuffer("class");
	 String p=s.concat("software");
	 StringBuffer p1=s1.append("software");
	 System.out.println(s);
	 System.out.println(p);
	 System.out.println(s1);
	 System.out.println(p1);
		
		
		
		
		

	}
}
