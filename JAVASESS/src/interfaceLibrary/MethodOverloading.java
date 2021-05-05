package interfaceLibrary;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		MethodOverloading n= new MethodOverloading();
		n.payment(777, "neha");
		
		System.out.println("---");
		
		

	}

	public void payment()
	{
		
		
	}
	
	public void payment(String UPI)
	{
		
		
	}
	
	
	public void payment(long phone, String UPI)
	

	{
		System.out.println(phone + UPI);
	
		
	}
	
	public void payment(String UPI, long phone)
	{
		
		
	}
}
