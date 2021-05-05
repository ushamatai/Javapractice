package Interviewpractice;

import java.util.Scanner;

public class printprimenos {
	
	static int a;
	static int b;
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		 int num=scan.nextInt();
		  int n= scan.nextInt();
		  System.out.println("Prime nos between" + num + " and " + n);
		  primeno(num, n);
		
		

	}
	
	static public void primeno(int a, int b) {
		//int a=0, b=0;
		//int a, b;
		
		while(a<=b) {
			int count=0;
			
			for(int i=2;i<=a/2;i++)
			{
				
				if(a%i==0)
				{
					count++;
					break;
				}
				
				
			}
			
			if(count==0) {
				System.out.println(a);
			
			}
			a++;
		
			
			
			
		}
	}

}





