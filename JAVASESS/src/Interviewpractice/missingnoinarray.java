package Interviewpractice;

public class missingnoinarray {

	public static void main(String[] args) {
	
		
		int a[]= {2,3,5,6};
		int sum=0, sum1=0;
		
		for( int i=0; i<a.length; i++) {
			sum1=sum1 +a[i];
			
			
			
		}
		System.out.println(sum1);
		
		
		
		
		for( int i=2; i<=6; i++) {
			sum=sum +i;
			
			
			
		}
		System.out.println(sum);
		
		System.out.println("Missing no is    " + (sum-sum1));
		
		
		

	}

}
