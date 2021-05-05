package Interviewpractice;

import java.util.Scanner;

public class fibonacci1 {

	
			static int n1;
			static int n2;
			static int count ;
			
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 2 nos of fibonacci series");
		n1=scan.nextInt();
		n2=scan.nextInt();
		System.out.println("Enter how many counts");
		count= scan.nextInt();
		//Without Using Recursion
		System.out.print(n1+ ", " + n2);
//		for(int i=1;i<=10;i++)
//		{
//			//i=1
//			int n3= n1+n2;//1+1= 2
//			System.out.print(", "+ n3);//n3= 2
//			n1=n2;//n1=1; 
//			n2=n3;//n2=2
//			}
		
		//With using recursion
		
		fibonacci(count-2);
		
			
		
	}
	
	static public void fibonacci(int count) {
		
		if(count>0)
		{
			int n3= n1+n2;
			System.out.print(", "+ n3);
			n1=n2;
			n2=n3;
			fibonacci(count-1);
			
		}
		
	}

}
