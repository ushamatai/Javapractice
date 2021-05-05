package Interviewpractice;

import java.util.Scanner;

public class Scannerclasspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Java program to enter float no and do the multiplication of same.
		
		
		Scanner in =new Scanner(System.in);
		//System.in is input stream source
		System.out.println("Please enter a no:");
		float f1= in.nextFloat();
		float f2=in.nextFloat();
		float f3=  2.0f;
		System.out.println("u entered 2 float nos: " + f1+"  " +f2);
		System.out.println("Multiplication of 2 nos is "   + (f1*f2*f3));
		

	}

}
