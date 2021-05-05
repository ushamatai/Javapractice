package Interviewpractice;

import java.util.Scanner;

public class armstrongno {

	
	static int  n=18;
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        String s=scan.nextLine();
	        //double y=scan.nextLine();
	       // System.out.println(i+s+y);
		
		
		if(n%2!=0){
            System.out.println("Weird");
        }
        else if (n%2==0  && n>20)
        {
            System.out.println("Weird");
        }
        else if (n%2==0  && (n>2||n<5))
        {
            System.out.println("Not Weird");
        }
        else if (n%2==0  && (n>6||n<20))
        {
            System.out.println("Weird");
        }
		
		
		System.out.println("------");
		
		
	
		
		int num =372;
		int temp= num, arm=0,r;
		
		while(num>0)
		{
			
			r= num%10;
			arm=arm+(r*r*r);
			num=num/10;
		}
		
		if(arm==temp)
		{
			System.out.println("Number is armstrong");
		}
		
		else
		{
			System.out.println("Number is not armstrong");
		}

	}

}
