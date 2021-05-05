
public class Overloading  extends BMW {
	Overloading(){
		
		System.out.println("In overload---constructor");
	}
	
	//static method  
	public  static void Start() {
		System.out.println("Start----Overloading Class");
	}
	
	public  void bye() {
		System.out.println("bye-----Overloading class");
	}
	
	
	//main method  
	public static void main(String args[])   
	{   
//		Car c1= new BMW();
//		c1.Start();
//		c1.Stop();
//		//c1.bye-- Ref type check as it is BMW method
//		
//		
//		BMW B=new BMW();
//		B.Start();
//		
//		//ClassCast exception
//		//BMW b =(BMW) new Car();
//	
//	
//	System.out.println("------------------------------");
//	
		Overloading obj =new Overloading();
		obj.welcome();
		obj.Start();
		obj.bye();
		BMW obj1 =new Overloading();
		obj.welcome();
	
		
		
		
		
		
		
	}

	@Override
    public void welcome() {
	System.out.println("Welcom Method");
//		
	}   
	
	
	

}
