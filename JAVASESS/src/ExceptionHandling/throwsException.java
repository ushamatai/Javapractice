package ExceptionHandling;

public class throwsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		throwsException obj= new throwsException();
		obj.m1();

	}

	
	public void m1()
	{
		System.out.println("In m1 block");
		m2();
	}
	
	//not advisable to throw and should throw only where exact exception is there
	//below is just for demonstration and not actually..
	public void m2() throws ArithmeticException
	{
		System.out.println("In m2 block");
		m3();
	}
	
	
	
	public void m3 () throws ArithmeticException
	{
		System.out.println("In m3 block");
		try
		{
			int i =9/0;
		}
		catch(ArithmeticException e)
		
		{
			System.out.println("Handled Exception");
			
		}
	}
}
