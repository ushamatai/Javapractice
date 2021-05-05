package Interviewpractice;

public class SingleDigit {
	static int n =73412;

	public static void main(String[] args) {
	
		sumsingle(n);
		

	}
	
	
	static void sumsingle(int n) {
		int sum=0;
		
		
			
		 
			while(n>0 ) {
				 int r= n%10;
				 sum = sum +r;
				 n=n/10;
			}
			//sum =14
			n=sum;
			if(n>9) {
			sumsingle(n);
			}
		
		else {
			System.out.println("Total = " + sum);	
		}
		
		
		
		
		
		
			 
			 
		 
		
		
		
	}

}


