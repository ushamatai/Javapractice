package ExceptionHandling;

public class Trycatchblock {

	public static void main(String[] args) {
		System.out.println("This is program");
		
		try{
			System.out.println("HEllo");
			int i =9/0; 
			System.out.println("Testing");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
			//print stack trace is best practice to be used
			//prints everything in detail, like package name, class name etc
			//e.printStackTrace();
			System.out.println("-----------");
			//Prints only by default message stored
			
			System.out.println(e.getMessage());
			
		}
	}

}
