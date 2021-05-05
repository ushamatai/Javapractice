package ArrayPrograms;

import java.util.Scanner;

public class MissingNoArray {
	
	
	public static void missing()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = scan.nextInt();
		//Enter value of array
		int[] arr= new int [n];
		//
		System.out.println("Enter (n-1) numbers: ");
	      for(int i=0; i<=n-2; i++) {
	         arr[i] = scan.nextInt();
	      }
		int givensum =0, expsum=0;
		//sum of given array
		for(int i =0; i <arr.length; i ++) {
			givensum = givensum +arr[i];
			
		}
		//Expected Array sum 
		 expsum=(n*(n+1))/2;
		 System.out.println("Expected sum is " +expsum);
		 //Missing no is 
		 int MissingNo=expsum-givensum;
		 System.out.println(MissingNo);
		 
		 
		
	}

	public static void main(String[] args) {
		//sum= n(n+1)/2
		//Nos are 1,2,3,4,5,6,7,8
		missing();
		
		 
		
		 
		

	}

}
