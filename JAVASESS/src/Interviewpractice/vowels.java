package Interviewpractice;

import java.util.Scanner;

public class vowels {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Alphabet ");
		char c=scan.next().charAt(0);
//		
//		if (  c=='a'||c== 'e'|| c== 'i' || c=='o'|| c=='u')
//		{
//          System.out.println(c + ": Alphabet is vowel");
//	}
//		
//		else
//		{
//			System.out.println(c +" :It is conso");
//		}
		
		
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Alphabet is vowel" + c);
			break;
			
			default:
				System.out.println("Alpha is conso");

}
}
}