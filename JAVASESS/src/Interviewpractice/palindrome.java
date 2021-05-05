package Interviewpractice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		palindrome(number);
		

	}
	
	
	static public void palindrome(int num) {
		
		int temp, r=1, sum=0;
		temp=num;
	 int arm=0;
		
		while(num>0)
		{
			r= num%10;
			sum=(sum*10) + r;
			num/=10;
			//arm=arm+(r*r*r);
			
		}
		if(temp==sum)
		{
			System.out.println("Number is palindrome" + temp);
		}
		else
		{
			System.out.println("Number is not palindrome" +temp);
		}
		//System.out.println(arm);
		
		
	
		
		
	}

}
