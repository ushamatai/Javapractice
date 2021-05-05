package interfaceLibrary;

import java.util.ArrayList;

public class Product {
	
	
	String productname;
	int price;
	int Quan;
	ArrayList<String> Seller ;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product P1= new Product();
		System.out.println(P1.productname + " "+ P1.price + "");
		Product P2=new Product("NikeShoes", 600);
		System.out.println(P2.productname + " "+ P2.price + "");
		
		ArrayList<String> Seller = new ArrayList<String>();
		Seller.add("AF Logistics");
		Seller.add("BM tran");
		Seller.add("JK Cement");
		
		Product P3=new Product("Antique", 600, 2, Seller);
		System.out.println(P3.productname + " "+ P3.price + " " + P3.Quan + " " + P3.Seller);
		
		System.out.println("--------------");
		for(String x: Seller)
		{
			System.out.println(x);
		}
		
		

	}
	
	
	
	public Product()
	{
		
	}



	public Product(String productname, int price) {
		
		this.productname = productname;
		this.price = price;
	}



	public Product(String productname, int price, int quan, ArrayList<String> seller) {
		
		this(productname, price);
		Quan = quan;
		Seller = seller;
	}
	
	
	
	

}
