package Interviewpractice;

import java.util.Scanner;

public class Swapnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 nos to swap");
		int a =scan.nextInt();
		int b= scan.nextInt();
		//int c;
		
		System.out.println("Value of a before swapping " + a);
		System.out.println("Value of b before swapping " + b);
		//By using one extra variable
		
//		c=a;
//		a=b;
//		b=c;
		
		
		
		// Without using 3rd value
		
		a= a+b; //5   2-->a=7, b= 2
		b=a-b;//b=5
		a=a-b;//a=7, b=5
				
	    System.out.println("Value of a after swapping " + a);
		System.out.println("Value of b after swapping " + b);
				
				
		
		
		
		

	}

}
