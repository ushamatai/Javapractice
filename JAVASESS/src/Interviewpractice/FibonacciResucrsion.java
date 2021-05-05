package Interviewpractice;

public class FibonacciResucrsion {
 static 	int n1= 1, n2 =2;
 static int num= 5, fact=1;
static 	int i=0;

	public static void main(String[] args) {
		
		
		
		System.out.print(n1 + " " + n2 + " ");
		fibint(n1, n2);
		
		System.out.println("-----------------------");
		System.out.println(fact(5));
		
//		System.out.print(n1 + " " + n2 + " ");
//		for( int i=1;i<=10;i++) {
//			
//			int n3= n1+n2;
//			System.out.print(n3 + " ");
//			n1=n2;
//			n2=n3;
//			
//		}
			}
	
	public static void fibint(int a, int b ) {
		
		
		if( i <=10)
		{
	    int c= a+b;
		System.out.print(c + " ");
		a=b;
		b=c;
		i++;
		fibint(a, b);
		
	}
	}
	
	
	public static int fact(int num) {
		
		
		if(num >=1)
		{
			
			fact=fact*num;
			num=num-1;
			fact(num);
			
			
		}
		
		return fact;
		
	}
	
	
	

}
