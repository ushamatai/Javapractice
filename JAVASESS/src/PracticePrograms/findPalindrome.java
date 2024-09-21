package PracticePrograms;

public class findPalindrome {
	static int pal=0;

	public static void main(String[] args) {
		
		
		int num=151;
		int xpal=0;

		int t=num;
		
		//To find the reverse of a number
		while(num>0) {		
		int temp= num%10;
			xpal= xpal*10 + temp;
		num=num/10;		
	}
		
		
		 pal=recurfact(num);
		 System.out.println(pal);
		if(t==pal) {
			System.out.println("number is palindrome" );
	
		}else {
			System.out.println("number is not palindrome");
		}		

	}
	
	//to find factorial of no using recursion
	public  static int recurfact(int num ) {
		if(num>0) {
		int temp= num%10;
		pal= pal*10 + temp;
		num=num/10;	
		recurfact(num);
		
		}	
		return pal;
	}

}
