package interfaceLibrary;

public class ArraBasics {
	
	static int a=10;

	public static void main(String[] args) {
		
		
		ArraBasics ar= new ArraBasics();
		ar.login();
		
		// TODO Auto-generated method stub

	}
	
	public void login(){
		System.out.println("Login");
		search();
		price();
	}
	
	
	public void search()
	{
		System.out.println("search");
		}

	public void checkout()
	{
		System.out.println("checkout");
	}
	
	public void getorder()
	{
		System.out.println("order");
	}
	
	
	public static void price()
	{
		System.out.println("price");
		weight();
	}
	
	
	public static void weight()
	{
		System.out.println("weight");
		
	}
}


