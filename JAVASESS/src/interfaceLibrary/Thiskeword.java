package interfaceLibrary;

public class Thiskeword {
	
//	public Thiskeword()
//	{
//		this(5);
//		System.out.println("hello m");
//		
//	}  
//	public Thiskeword(int i)
//	
//	{  
//		//this(); 
//	System.out.println("hello n");  
//	System.out.println(i);
//	//m();//same as this.m()  
//	
//	}  
//	
	
	void m()
	
	{
		n();
		System.out.println("Inside m");
	}

void n ()
	
	{
		System.out.println("Inside n ");
	}

void q ()

{
	
	System.out.println("Inside q");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thiskeword sdf= new Thiskeword();
		sdf.q();
		//sdf.n();
		
		
	}

}
