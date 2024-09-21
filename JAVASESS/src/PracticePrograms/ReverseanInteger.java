package PracticePrograms;

public class ReverseanInteger {

	public static void main(String[] args) {
		
     	int num = 1234;
		int rev=0;
		
//		int num = 5/2; //This will give quotient
//		int rev=5%2; //This will give reminder
		
		
		while(num>0) {
		rev=rev*10 +num%10;
		num=num/10;
		
		}
		System.out.println(rev);
	
		
		
		
		
		
		

	}

}
