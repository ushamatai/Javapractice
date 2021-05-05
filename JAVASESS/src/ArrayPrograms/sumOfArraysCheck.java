package ArrayPrograms;

import java.util.HashSet;

public class sumOfArraysCheck {

	public static void main(String[] args) {
		int arr[]= {3,4,7,2,8,10,9,6,8,0,16};
		int sum =16;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length; j++) {
				
				int temp = arr[i] + arr[j];
				if(sum==temp) {
					
					System.out.println("Pair of " + sum + " is : " + "(" + arr[i]+ ", " + arr[j] + ")");
				}
				
				
				
			}
		}
		

	}

}
