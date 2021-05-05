package Interviewpractice;

import java.util.Scanner;

public class factorialno {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter num");
		int number=in.nextInt();
		
		factorialno fct= new factorialno();
		fct.factorial(number);
		

	}
	
	
	public void factorial(int num) {
		int fact=1;
		
		while(num>0) {
			
			
			fact=fact*num;
			num--;
			
		}
		System.out.println("factorial of no is " + fact);
	}

}
