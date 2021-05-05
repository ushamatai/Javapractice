package Interviewpractice;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num =scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is Even :  "  + num);
		}
		else
		{
			System.out.println("Number is Odd  : "  +num);
		}

	}

}
