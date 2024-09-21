package PracticePrograms;

public class Armstrong {

	public static void main(String[] args) {
		
		
		int num =154;
		int t= num;
		int rem;
		int cube= 0;
		
		while(num>0) {
			rem= num%10;
			num=num/10;
			cube= cube +(rem*rem*rem);			
		}
		
		if(t==cube) {
			System.out.println("number is armstrong  " +cube );
	
		}else {
			System.out.println("number is not armstrong  "  + cube);
		}
		System.out.println("---------------------------------");
		int a = 10;
		int b = 10;
		System.out.print("b is " + (b += 1));
		 System.out.print("\n" + (a += (a = 5) * (a / 5)));

		
		
		
		

	}

}
