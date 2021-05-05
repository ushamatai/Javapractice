package interfaceLibrary;

public class StringManipulation {

	public static void main(String[] args) {
		
		//String is basically an object that represents sequence of char values
		char c[]= {'j','a','v','a'};
//		System.out.println(c);
//		
//		
//		System.out.println("hhhhhhhhhhhhhh");
//		
//		String s =new String();
//		System.out.println(s);
		
		
		String sp =new String("Amazon");
		sp.concat("Prime");
		System.out.println(sp.concat("Prime"));
		System.out.println(sp);
		
		StringBuffer sp1 =new StringBuffer("Amazon");
		sp1.append("Prime");
		System.out.println(sp1.append("Prime"));
		System.out.println(sp1);
		
	}

}
