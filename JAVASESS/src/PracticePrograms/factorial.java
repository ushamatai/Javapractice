package PracticePrograms;

public class factorial {

	public static void main(String[] args) {
		
		
		
		factorial facting = new factorial();
		
//		System.out.println("Factorial of  4 is "  + facting.fact(4) );	
//		System.out.println("Factorial of  0 is "  + facting.fact(0) );	
//		System.out.println("Factorial of  3 is "  + facting.fact(3) );
		
		System.out.println("Factorial of  4 is "  + facting.recurfact(4) );	
//		System.out.println("Factorial of  0 is "  + facting.recurfact(0) );	
//		System.out.println("Factorial of  3 is "  + facting.recurfact(3) );

	}
	
	
	//To find factorial using this method
	
	public int fact(int num) {
		
		int fact=1;
		if(num==0)
			return 1;	
		for(int i=1;i<=num;i++) {
			fact =fact*i;					
		}
		return fact;		
		
	}
	
	//To find factorial through recursion
	
	public int recurfact(int num) {
		int fact;
		if(num==0) 
			return 1;	
		else  
			fact=num*recurfact(num-1);
		System.out.println("Factorial for" + num+ "loop is  " + fact);
			return fact;			
			
	}
	
	
	
	

}
