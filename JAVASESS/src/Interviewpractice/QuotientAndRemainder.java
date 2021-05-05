package Interviewpractice;

import java.io.InputStream;
import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Dividend");
		int Dividend=scan.nextInt();
		System.out.println("Enter the Divisor");
		int Divisor= scan.nextInt();
		
		int quotient= Dividend/Divisor;
		int remainder= Dividend%Divisor;
		System.out.println("Quotient is   : " +quotient );
		System.out.println("Remainder is   : " +remainder );
		

	}

}
