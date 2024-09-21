package PracticePrograms;

public class missingnoinarray {

	public static void main(String[] args) {
		
		//1. Find missing no in array when numbers are in sequence
		int a[] = {1, 2,4, 5, 6};
		int num=0;
		int num1=0;
		
		//Add numbers of missing array
		for(int i=0;i<a.length ;i++) {
			
			num=num+a[i];		
		}
		System.out.println(num);
		
		//Add numbers of Original Array
       for(int j=1;j<=6 ;j++) {
			
			num1=num1+j;		
		}
		System.out.println(num1);
		
		System.out.println("Missing no in the array is :: " +(num1-num));
		
		//2. Find missing no in array when numbers are in sequence
		
		int b[] = { 2,4, 5, 6,7};
		int missedarray[]= {2,4,6,7};
		
		
		
		
		
		
	}

}
