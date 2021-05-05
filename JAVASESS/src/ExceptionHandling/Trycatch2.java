package ExceptionHandling;

public class Trycatch2 {
	String name;
	

	public static void main(String[] args) {
		
		System.out.println("This is program");
		
		//Exception Mismatch
		//exception is arithmetic but you are catching for exception null pointer..in that cases there wont be any significance 
		//of try catch block
//		try {
//			int i=9/0;
//		}
//       catch(NullPointerException e)
//		{
//	System.out.println("Exception Handled");
//}
		Trycatch2 obj= new Trycatch2();
		obj=null;
		try
		{
			//int i=9/0;
			System.out.println(obj.name);
			int i=9/0;
		}
		catch(NullPointerException e) {
		System.out.println("Exception is thrown");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception thrown for airth");
			
		}
		}

}
