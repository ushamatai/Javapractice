package Interviewpractice;

import java.util.Scanner;

public class primenos {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter prime no to check");
		int num= in.nextInt();
		primeno(num);
	}
	
	static public void primeno(int number) {
		int count=0;
		//int range=0;
		
		if(number==1 || number==0)
		{
			System.out.println("Number is not prime: ");
		}
		
		else if (number>=2) {
			
			
			
			for(int i=2;i<=number/2;i++)// i=2; i<=1
			{
				
				System.out.println("Dividing " + number+  "with "  + i);
				if (number%i==0)
				{
					count = 1;
				
					
				}	
			}
			if (count==1) {
				System.out.println("Number is not prime " + number);
			}
			else
			{
				System.out.println("Number is prime " + number);	
			
			
			
		}}
		
		
		
	}

}
