package ExceptionHandling;

public class throwkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=null;
//		if(s.equals(null))//Throws exception
//		{
//			System.out.println("Hello");
//		}
		
		if(s==null)
		{
			System.out.println("isue");
			try {
				
			
			throw new Exception("Created an error");
			}
		
		
		catch(Exception e)
		{
			System.out.println("Error Handled");
		}
	}
	}
	

}
